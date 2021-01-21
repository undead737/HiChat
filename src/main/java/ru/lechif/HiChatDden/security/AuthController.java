package ru.lechif.HiChatDden.security;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;
import ru.lechif.HiChatDden.security.auth.UserService;
import ru.lechif.HiChatDden.security.auth.jwt.JwtAuthException;
import ru.lechif.HiChatDden.security.auth.jwt.JwtResponse;
import ru.lechif.HiChatDden.security.auth.jwt.JwtTokenProvider;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Data
    private static class AuthRequestModel {
        private String loginIdentifier;
        private String loginPassword;
    }

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider provider;
    private final UserService<CrvAuthUser> userService;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, JwtTokenProvider provider, UserService<CrvAuthUser> userService) {
        this.authenticationManager = authenticationManager;
        this.provider = provider;
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody AuthRequestModel authData) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authData.getLoginIdentifier(), authData.getLoginPassword()));
            final CrvAuthUser user = userService.getUserByName(authData.getLoginIdentifier());
            if (user == null) throw new UsernameNotFoundException("Пользователь не найден!");
            return new ResponseEntity<>(new JwtResponse(provider.generateToken(authData.getLoginIdentifier(),
                    user.getRoles()), authData.getLoginIdentifier(), user.getFirstName(),
                    user.getRoles().stream().map(CrvAuthRole::getRoleName).collect(Collectors.toList())), HttpStatus.OK);
        } catch (JwtAuthException ex) {
            return new ResponseEntity<>("Invalid us/pass", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody CrvAuthUser registerData) {
        try {
            CrvAuthUser newUser = userService.register(registerData);
            Map<Object, Object> response = new HashMap<>();
            response.put("userName", registerData.getUserName());
            response.put("token", provider.generateToken(registerData.getUserName(), newUser.getRoles()));
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

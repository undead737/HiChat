package ru.lechif.HiChatDden.security.auth.jwt;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.auth.CrvUserDetailsService;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtTokenProvider {

    @Value("${jwt.token.secret}")
    private String secret;

    private final CrvUserDetailsService detailsService;

    @Autowired
    public JwtTokenProvider(CrvUserDetailsService detailsService) {
        this.detailsService = detailsService;
    }

    public String generateToken(String userName, List<CrvAuthRole> role){
        Claims cl = Jwts.claims().setSubject(userName);
        cl.put("roles", role.stream().map(CrvAuthRole::getRoleName).collect(Collectors.toList()));
        Date now = new Date(System.currentTimeMillis());
        long time = 3600000;
        Date validityDate = new Date(now.getTime() + time);
        return Jwts.builder().setClaims(cl).setIssuedAt(now).setExpiration(validityDate).signWith(SignatureAlgorithm.HS512, secret).compact();
    }

    public Authentication getAuthentication(String token){
        UserDetails uDetails = detailsService.loadUserByUsername(getUserName(token));
        return new UsernamePasswordAuthenticationToken(uDetails, "", uDetails.getAuthorities());
    }

    public String resolveToken(HttpServletRequest req){
        String token = req.getHeader("Authorization");
        if (token!=null && token.startsWith("Bearer")){
            return token.substring(7);
        }
        return null;
    }

    private String getUserName(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody().getSubject();
    }

    public boolean isValid(String token){
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(secret).parseClaimsJws(token);
            return !claimsJws.getBody().getExpiration().before(new Date());
        } catch (JwtException | IllegalArgumentException ex) {
            throw new JwtAuthException("");
        }
    }
}

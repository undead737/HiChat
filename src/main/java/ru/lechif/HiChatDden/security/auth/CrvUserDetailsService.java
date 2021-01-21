package ru.lechif.HiChatDden.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

@Service
public class CrvUserDetailsService implements UserDetailsService {

   private final UserService<CrvAuthUser> userService;

   @Autowired
    public CrvUserDetailsService(UserService<CrvAuthUser> userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        CrvAuthUser user = userService.getUserByName(userName);
        if (user==null) throw new UsernameNotFoundException("");
        return UserToUserDetailsCast.cast(user);
    }
}

package ru.lechif.HiChatDden.security.auth.oauth;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.security.dao.UserDao;
import ru.lechif.HiChatDden.security.auth.UserService;
import ru.lechif.HiChatDden.security.models.CliAuth.CliAuthUser;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class OauthUserService extends UserService<CliAuthUser> implements OAuth2UserService {

    public OauthUserService(@Qualifier("CliAuthUserDao") UserDao<CliAuthUser> dao) {
        super(dao);
    }

    @Override
    public CliAuthUser register(CliAuthUser user) {
        return null;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest oAuth2UserRequest) throws OAuth2AuthenticationException {
        switch (oAuth2UserRequest.getClientRegistration().getRegistrationId()){
            case "git":
                return new OAuth2User() {
                    @Override
                    public Map<String, Object> getAttributes() {
                        return new HashMap<>();
                    }

                    @Override
                    public Collection<? extends GrantedAuthority> getAuthorities() {
                        return null;
                    }

                    @Override
                    public String getName() {
                        return "asdas";
                    }
                };

            case "vk":
                String fa = oAuth2UserRequest.getAccessToken().toString();
                break;
            default:
                break;
        }
        return null;
    }
}

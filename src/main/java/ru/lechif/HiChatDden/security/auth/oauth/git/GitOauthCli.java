package ru.lechif.HiChatDden.security.auth.oauth.git;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.auth.oauth.OauthClient;

import java.util.Map;

import static org.springframework.security.oauth2.core.AuthorizationGrantType.AUTHORIZATION_CODE;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.POST;

@Component
public class GitOauthCli implements OauthClient {

    @Override
    public ClientRegistration getRegistration() {
        return ClientRegistration
                .withRegistrationId("git")
                .clientName("git")
                .clientId("7307606578724bc09ea6")
                .clientSecret("0b5ab61bff15244be1af5dec21e7ed864a4797c3")
                .redirectUriTemplate("{baseUrl}/api/oauth/redirect/{registrationId}")
                .authorizationGrantType(AUTHORIZATION_CODE)
                .clientAuthenticationMethod(POST)
                .scope("read:user", "user:email")
                .authorizationUri("https://github.com/login/oauth/authorize")
                .tokenUri("https://github.com/login/oauth/access_token")
                .userInfoUri("https://api.github.com/user")
                .userNameAttributeName("username")
                .build();
    }

    @Override
    public Map<String, Object> getCustomParameters() {
        return null;
    }

}

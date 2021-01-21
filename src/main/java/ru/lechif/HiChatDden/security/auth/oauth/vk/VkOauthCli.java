package ru.lechif.HiChatDden.security.auth.oauth.vk;

import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.auth.oauth.OauthClient;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.security.oauth2.core.AuthorizationGrantType.AUTHORIZATION_CODE;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.BASIC;
import static org.springframework.security.oauth2.core.ClientAuthenticationMethod.POST;

@Component
public class VkOauthCli implements OauthClient {

    @Override
    public ClientRegistration getRegistration() {
        return ClientRegistration
                .withRegistrationId("vk")
                .clientName("vk")
                .clientId("7718411")
                .clientSecret("Iljk70SH3yA8k2ljd5Cf")
                .redirectUriTemplate("{baseUrl}/api/oauth/redirect/{registrationId}")
                .authorizationGrantType(AUTHORIZATION_CODE)
                .clientAuthenticationMethod(POST)
                .scope("email")
                .authorizationUri("https://oauth.vk.com/authorize")
                .tokenUri("https://oauth.vk.com/access_token?client_secret=Iljk70SH3yA8k2ljd5Cf")
                .userInfoUri("https://api.vk.com/method/users.get?v=5.52&{user_id}")
                .userNameAttributeName("user_ids")
                .build();
    }

    @Override
    public Map<String, Object> getCustomParameters() {
        return new HashMap<>();
    }
}
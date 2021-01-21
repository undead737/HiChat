package ru.lechif.HiChatDden.security.auth.oauth;

import org.springframework.lang.Nullable;
import org.springframework.security.oauth2.client.registration.ClientRegistration;

import java.util.Map;

public interface OauthClient {
    ClientRegistration getRegistration();
    @Nullable
    Map<String, Object> getCustomParameters();
}

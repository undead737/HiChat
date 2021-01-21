package ru.lechif.HiChatDden.security.auth.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.DefaultOAuth2AuthorizationRequestResolver;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestResolver;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


public class CustomAuthorizationRequestResolver {

//    private final ClientRegistrationRepository rep;
//    private OAuth2AuthorizationRequestResolver defaultResolver;
//
//    @Autowired
//    public CustomAuthorizationRequestResolver(ClientRegistrationRepository rep) {
//        this.rep = rep;
//        defaultResolver = new DefaultOAuth2AuthorizationRequestResolver(rep, "tests");
//    }
//
//    @Override
//    public OAuth2AuthorizationRequest resolve(HttpServletRequest request) {
//        OAuth2AuthorizationRequest req = defaultResolver.resolve(request);
//        if(req != null) {
//            req = customizeAuthorizationRequest(req);
//        }
//        return req;
//    }
//
//    @Override
//    public OAuth2AuthorizationRequest resolve(HttpServletRequest request, String clientRegistrationId) {
//        OAuth2AuthorizationRequest req = defaultResolver.resolve(request, clientRegistrationId);
//        if(req != null) {
//            req = customizeAuthorizationRequest(req);
//        }
//        return req;
//    }
//
//    private OAuth2AuthorizationRequest customizeAuthorizationRequest(
//            OAuth2AuthorizationRequest req) {
//        Map<String,Object> extraParams = new HashMap<String,Object>();
//        extraParams.putAll(req.getAdditionalParameters());
//        extraParams.put("test", "extra");
//
//        return OAuth2AuthorizationRequest
//                .from(req)
//                .additionalParameters(extraParams)
//                .build();
//    }
}

package ru.lechif.HiChatDden.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import ru.lechif.HiChatDden.security.auth.jwt.JwtConfigurer;
import ru.lechif.HiChatDden.security.auth.jwt.JwtTokenProvider;
import ru.lechif.HiChatDden.security.auth.oauth.OauthUserService;
import ru.lechif.HiChatDden.security.auth.oauth.git.GitOauthCli;
import ru.lechif.HiChatDden.security.auth.oauth.vk.VkOauthCli;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider provider;
    private final OauthUserService userService;
    private static final String LOGIN_PATH = "/api/**";

    @Autowired
    public SecurityConfig(JwtTokenProvider provider, OauthUserService userService) {
        this.provider = provider;
        this.userService = userService;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

//    @Bean
//    @Autowired
//    public ClientRegistrationRepository clientRegistrationRepository(VkOauthCli vkCli, GitOauthCli gitCli) {
//        List<ClientRegistration> registrations = new ArrayList<>();
//        registrations.add( vkCli.getRegistration() );
//        registrations.add( gitCli.getRegistration() );
//        return new InMemoryClientRegistrationRepository(registrations);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().authorizeRequests().antMatchers(LOGIN_PATH).permitAll()
                .anyRequest().authenticated().and()
                .apply(new JwtConfigurer(provider));

    }

}

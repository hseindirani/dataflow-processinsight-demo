package com.dataflowprocessinsightdemo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Authorize all requests to be authenticated
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated()
                )
                // Use OAuth2/OpenID Connect for login
                .oauth2Login(Customizer.withDefaults());

        return http.build();
    }
}


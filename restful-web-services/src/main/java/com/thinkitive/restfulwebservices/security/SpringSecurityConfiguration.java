package com.thinkitive.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // 1) All requests should be autheticated
        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );

//        2) If a request is not authenticated, a web page is shows
        http.httpBasic(Customizer.withDefaults());

//        #) CSRF -> POST, PUT
        http.csrf().disable();
        return http. build();
    }
}
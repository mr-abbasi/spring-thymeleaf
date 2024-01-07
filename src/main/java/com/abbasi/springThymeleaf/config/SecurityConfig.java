package com.abbasi.springThymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean()
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(h->h.disable())
                .authorizeHttpRequests(r ->
                r.requestMatchers("/").permitAll()
                        .requestMatchers("/aboutus").permitAll()
                        .requestMatchers("/contactus").permitAll()
                        .requestMatchers("/saveContactUs").denyAll()
                        .requestMatchers("/persons/**").denyAll()
                        .anyRequest().denyAll())
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());
        return http.build();
    }
}
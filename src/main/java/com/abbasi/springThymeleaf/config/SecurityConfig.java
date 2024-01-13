package com.abbasi.springThymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.ignoringRequestMatchers("/saveContactUs"))
                .authorizeHttpRequests(r ->
                        r.requestMatchers("/").permitAll()
                                .requestMatchers("/aboutus").permitAll()
                                .requestMatchers("/contactus").permitAll()
                                .requestMatchers("/saveContactUs").authenticated()
                                .requestMatchers("/persons/**").authenticated()
                                .requestMatchers("/error").authenticated()
                                .requestMatchers("/logout").authenticated()
                                .anyRequest().denyAll())
                .httpBasic(Customizer.withDefaults())
                .formLogin(loginConfigurer -> loginConfigurer.loginPage("/login").defaultSuccessUrl("/").failureUrl("/login?error=true").permitAll())
                .logout(logoutConfigurer -> logoutConfigurer.logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userManager() {
        UserDetails user = User
                .withDefaultPasswordEncoder()
                .username("mohammad")
                .password("1234567")
                .roles("USER")
                .build();

        UserDetails admin = User
                .withDefaultPasswordEncoder()
                .username("john")
                .password("123456")
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }
}

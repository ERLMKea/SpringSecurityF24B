package org.example.springsecurityf24b.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> {
            requests.requestMatchers("/myAccount","/myBalance").authenticated()
                    .requestMatchers("/contact").permitAll();
        });
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        DefaultSecurityFilterChain obj = http.build();
        return obj;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        //var obj = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        //return obj;
        return new BCryptPasswordEncoder(20);
        //return NoOpPasswordEncoder.getInstance();
    }

}

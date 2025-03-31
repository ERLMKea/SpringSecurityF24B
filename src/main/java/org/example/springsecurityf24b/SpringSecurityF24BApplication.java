package org.example.springsecurityf24b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityF24BApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityF24BApplication.class, args);
    }

}

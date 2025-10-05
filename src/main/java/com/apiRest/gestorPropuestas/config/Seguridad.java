package com.apiRest.gestorPropuestas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//autenticacion que pide en la letra
@Configuration
public class Seguridad {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF para pruebas con POSTMAN
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().authenticated() // Exige autenticación para todos los endpoints
                )
                .httpBasic(Customizer.withDefaults()); // Habilita autenticación básica

        return http.build();
    }
}

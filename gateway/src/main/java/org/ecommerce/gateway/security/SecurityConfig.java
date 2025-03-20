//package org.ecommerce.gateway.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        http
//                .authorizeExchange()
//                .pathMatchers("/public/**").permitAll()  // Allow unauthenticated access to the public paths
//                .anyExchange().permitAll()  // Allow all other requests without authentication
//                .and()
//                .csrf().disable();  // Optional: Disable CSRF for simplicity if not using sessions or cookies
//
//        // No custom filter is required as authentication is bypassed
//        return http.build();
//    }
//}

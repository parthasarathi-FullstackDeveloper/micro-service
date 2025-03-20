package org.ecommerce.gateway.config;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class Login {
    @PostMapping("/login")
    public String token(){
        return "token";
    }
}

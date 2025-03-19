package org.ecommerce.gateway.controller;

import org.ecommerce.gateway.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {
@PostMapping("/login")
    public String loginUser(User user){
    return "";
}
@PostMapping("/register")
    public String registerUser(){
    return "";
}
}

package org.user.com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductSearchController {
    @PostMapping("/product")
    public String get(){
        return "Get All Products";
    }
}

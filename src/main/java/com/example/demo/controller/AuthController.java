package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.LoginRequest;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api")
public class AuthController {
    
    @GetMapping("/sign-up")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping("/login")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
    
    
}

package com.example.preparer.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Role {

    @GetMapping("/")
    public String hello (){
        return "Pritesh Singh";
    }
    
    
}
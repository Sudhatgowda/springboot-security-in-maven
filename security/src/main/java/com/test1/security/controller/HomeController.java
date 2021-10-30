package com.test1.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String home(){

        return "WELCOME EVERYONE THIS FILE IS OF HOW TO SET USERNAME & PASSWORD";
    }
}

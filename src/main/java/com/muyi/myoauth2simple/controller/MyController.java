package com.muyi.myoauth2simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome for all.";
    }

    @GetMapping("/admin")
    public String getAdminWelcome(){
        return "Welcome admin";
    }


}

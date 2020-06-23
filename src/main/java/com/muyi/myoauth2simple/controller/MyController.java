package com.muyi.myoauth2simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private OAuth2ClientContext oAuth2ClientContext;

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome for all.";
    }

    @GetMapping("/admin")
    public String getAdminWelcome(){
        return "Welcome admin";
    }

//    @GetMapping("/token")
//    public String getToken(){
//        System.out.println("Token is: "+oAuth2ClientContext.getAccessToken().getValue());
//        return oAuth2ClientContext.getAccessToken().getValue();
//    }
}

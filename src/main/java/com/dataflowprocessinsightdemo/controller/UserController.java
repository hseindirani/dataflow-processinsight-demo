package com.dataflowprocessinsightdemo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String, Object> userDetails(@AuthenticationPrincipal OidcUser principal) {
        Map<String, Object> userData = new HashMap<>();
        userData.put("userName", principal.getFullName());
        userData.put("attributes", principal.getAttributes());
        return userData;
    }
}

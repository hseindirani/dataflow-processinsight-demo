package com.dataflowprocessinsightdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Redirect to the /user endpoint, where we display user details
        return "redirect:/user";
    }
}

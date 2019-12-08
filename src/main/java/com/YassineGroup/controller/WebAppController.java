package com.YassineGroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/register")
    public String register() {
        return "registrieren";
    }

    @GetMapping("/loggin")
    public String loggin() {
        return "loggin";
    }

}
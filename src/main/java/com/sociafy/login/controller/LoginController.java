package com.sociafy.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Nome da view login.html
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Nome da view home.html, página inicial pós-login
    }

    @GetMapping("/planejamento")
    public String planejamento() {
        return "planejamento"; // Nome da view home.html, página inicial pós-login
    }
}

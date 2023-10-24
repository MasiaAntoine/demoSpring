package com.example.demoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonControleur {

    @GetMapping("/index")
    public String accueil() {
        System.out.println("=> intering methode");
        return "index"; // Cela renverra le modèle "index.html"
    }
}

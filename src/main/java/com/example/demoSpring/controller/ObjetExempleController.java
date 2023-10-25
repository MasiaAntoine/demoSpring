package com.example.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.ObjetExempleModel;

@RestController
public class ObjetExempleController {

    @GetMapping("/objetExemple")
    public ObjetExempleModel getObjetExemple() {
        return ObjetExempleModel.builder()
                .nom("Jean")
                .age(25)
                .build();
    }

}

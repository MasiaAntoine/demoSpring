package com.example.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.wizardModel.ProfileWrapper;
import com.example.demoSpring.model.wizardModel.Spec;
import com.example.demoSpring.model.wizardModel.Profile;

@RestController
public class Wizard {

    @GetMapping("/wizard/spec")
    public ProfileWrapper getWizardSpec() {
        Spec emailSpec = new Spec(20);
        Spec phoneSpec = new Spec(20);
        Profile wizardProfile = new Profile(emailSpec, phoneSpec);
        return new ProfileWrapper(wizardProfile);
    }
}
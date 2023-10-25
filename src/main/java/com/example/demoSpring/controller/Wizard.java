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
        Spec emailSpec = Spec.builder().maxLength(20).build();
        Spec phoneSpec = Spec.builder().maxLength(20).build();
        Profile wizardProfile = Profile.builder()
                .email(emailSpec)
                .phone(phoneSpec)
                .build();
        return ProfileWrapper.builder()
                .profile(wizardProfile)
                .build();
    }

}
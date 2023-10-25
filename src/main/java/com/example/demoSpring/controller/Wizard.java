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
        Spec emailSpec = Spec.builder()
                .maxLength(50)
                .minLength(3)
                .allowedCharacter("")
                .build();
        Spec phoneSpec = Spec.builder()
                .maxLength(20)
                .minLength(10)
                .allowedCharacter("^[0-9+ ]+$")
                .build();
        Spec passwordSpec = Spec.builder()
                .maxLength(50)
                .minLength(3)
                .allowedCharacter("")
                .build();
        Spec lastnameSpec = Spec.builder()
                .maxLength(50)
                .minLength(3)
                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                .build();
        Spec firstnameSpec = Spec.builder()
                .maxLength(50)
                .minLength(3)
                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                .build();

        Profile wizardProfile = Profile.builder()
                .email(emailSpec)
                .phone(phoneSpec)
                .password(passwordSpec)
                .lastname(lastnameSpec)
                .firstname(firstnameSpec)
                .build();

        return ProfileWrapper.builder()
                .profile(wizardProfile)
                .build();
    }

}
package com.example.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.EmailSpec;
import com.example.demoSpring.model.PhoneSpec;
import com.example.demoSpring.model.ProfileWrapper;
import com.example.demoSpring.model.WizardProfile;

@RestController
public class Wizard {

    @GetMapping("/wizard/spec")
    public ProfileWrapper getWizardSpec() {
        EmailSpec emailSpec = new EmailSpec(20);
        PhoneSpec phoneSpec = new PhoneSpec(20);
        WizardProfile wizardProfile = new WizardProfile(emailSpec, phoneSpec);
        return new ProfileWrapper(wizardProfile);
    }

}
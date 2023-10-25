package com.example.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.wizard.Profile;
import com.example.demoSpring.model.wizard.Shop;
import com.example.demoSpring.model.wizard.Spec;
import com.example.demoSpring.model.wizard.Wrapper;

@RestController
public class Wizard {

        @GetMapping("/wizard/spec")
        public Wrapper getWizardSpec() {
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
                Spec nameShopSpec = Spec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                                .build();
                Spec firstnameSpec = Spec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                                .build();
                Spec adressSpec = Spec.builder()
                                .maxLength(300)
                                .minLength(10)
                                .allowedCharacter("^[a-zA-Z0-9 éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ,'-]+$")
                                .build();

                Profile profile = Profile.builder()
                                .email(emailSpec)
                                .phone(phoneSpec)
                                .password(passwordSpec)
                                .lastname(lastnameSpec)
                                .firstname(firstnameSpec)
                                .build();

                Shop shop = Shop.builder()
                                .phone(phoneSpec)
                                .name(nameShopSpec)
                                .adress(adressSpec)
                                .build();

                return Wrapper.builder()
                                .profile(profile)
                                .shop(shop)
                                .build();
        }

}
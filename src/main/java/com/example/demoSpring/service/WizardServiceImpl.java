package com.example.demoSpring.service;

import org.springframework.stereotype.Service;

import com.example.demoSpring.model.wizard.WizardModelProfile;
import com.example.demoSpring.model.wizard.WizardModelShop;
import com.example.demoSpring.model.wizard.WizardModelSpec;
import com.example.demoSpring.model.wizard.WizardModelWrapper;

@Service
public class WizardServiceImpl implements WizardService {

        @Override
        public WizardModelWrapper getWizardSpec() {
                // Votre logique actuelle ici...

                WizardModelSpec emailSpec = WizardModelSpec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("")
                                .build();
                WizardModelSpec phoneSpec = WizardModelSpec.builder()
                                .maxLength(20)
                                .minLength(10)
                                .allowedCharacter("^[0-9+ ]+$")
                                .build();
                WizardModelSpec passwordSpec = WizardModelSpec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("")
                                .build();
                WizardModelSpec lastnameSpec = WizardModelSpec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                                .build();
                WizardModelSpec nameShopSpec = WizardModelSpec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                                .build();
                WizardModelSpec firstnameSpec = WizardModelSpec.builder()
                                .maxLength(50)
                                .minLength(3)
                                .allowedCharacter("^[a-zA-Z éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ-]+$")
                                .build();
                WizardModelSpec adressSpec = WizardModelSpec.builder()
                                .maxLength(300)
                                .minLength(10)
                                .allowedCharacter("^[a-zA-Z0-9 éèêëàâäôöùûüçÉÈÊËÀÂÄÔÖÙÛÜÇ,'-]+$")
                                .build();

                WizardModelProfile profile = WizardModelProfile.builder()
                                .email(emailSpec)
                                .phone(phoneSpec)
                                .password(passwordSpec)
                                .lastname(lastnameSpec)
                                .firstname(firstnameSpec)
                                .build();

                WizardModelShop shop = WizardModelShop.builder()
                                .phone(phoneSpec)
                                .name(nameShopSpec)
                                .adress(adressSpec)
                                .build();

                return WizardModelWrapper.builder()
                                .profile(profile)
                                .shop(shop)
                                .build();
        }
}
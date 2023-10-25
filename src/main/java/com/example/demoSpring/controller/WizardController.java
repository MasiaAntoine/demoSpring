package com.example.demoSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.WizardModelWrapper;
import com.example.demoSpring.service.WizardService;

@RestController
public class WizardController {

        @Autowired
        private WizardService wizardService;

        @GetMapping("/wizard/spec")
        public WizardModelWrapper getWizardSpec() {
                return wizardService.getWizardSpec();
        }

}
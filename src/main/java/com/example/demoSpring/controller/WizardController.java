package com.example.demoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.WizardModelWrapper;
import com.example.demoSpring.service.WizardService;

import lombok.RequiredArgsConstructor;

@RestController("WizardController")
@RequiredArgsConstructor
public class WizardController {

        private final WizardService wizardService;

        @GetMapping("/wizard/spec")
        public WizardModelWrapper getWizardSpec() {
                return wizardService.getWizardSpec();
        }

}
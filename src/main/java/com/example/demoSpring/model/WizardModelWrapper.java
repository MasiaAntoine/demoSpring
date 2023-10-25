package com.example.demoSpring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class WizardModelWrapper {
    private WizardModelProfile profile;
    private WizardModelShop shop;
}
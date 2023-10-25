package com.example.demoSpring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class WizardModelProfile {
    private final WizardModelSpec lastname;
    private final WizardModelSpec firstname;
    private final WizardModelSpec password;
    private final WizardModelSpec email;
    private final WizardModelSpec phone;
}
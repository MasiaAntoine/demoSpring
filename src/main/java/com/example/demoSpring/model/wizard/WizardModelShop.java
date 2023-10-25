package com.example.demoSpring.model.wizard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class WizardModelShop {
    private WizardModelSpec phone;
    private WizardModelSpec name;
    private WizardModelSpec adress;
}

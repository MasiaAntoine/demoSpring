package com.example.demoSpring.model.wizard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Shop {
    private Spec phone;
    private Spec name;
    private Spec adress;
}

package com.example.demoSpring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class ObjetExempleModel {
    private final String nom;
    private final int age;
}

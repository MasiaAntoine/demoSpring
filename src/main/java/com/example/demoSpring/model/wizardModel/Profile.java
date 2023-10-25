package com.example.demoSpring.model.wizardModel;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class Profile {
    private final Spec email;
    private final Spec phone;
}
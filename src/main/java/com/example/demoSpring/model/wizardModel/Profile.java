package com.example.demoSpring.model.wizardModel;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class Profile {
    private final Spec lastname;
    private final Spec firstname;
    private final Spec password;
    private final Spec email;
    private final Spec phone;
}
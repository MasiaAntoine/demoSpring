package com.example.demoSpring.model.wizardModel;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class ProfileWrapper {
    private final Profile profile;
}
package com.example.demoSpring.model.wizardModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class Spec {
    @JsonProperty("max-length")
    private final int maxLength;
}
package com.example.demoSpring.model.wizard;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WizardModelSpec {
    @JsonProperty("max-length")
    private final int maxLength;

    @JsonProperty("min-length")
    private int minLength;

    @JsonProperty("allowed-character")
    private final String allowedCharacter;

    @Builder
    public WizardModelSpec(int maxLength, int minLength, String allowedCharacter) {
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.allowedCharacter = allowedCharacter;
        adjustMinLength();
    }

    private void adjustMinLength() {
        if (minLength > maxLength) {
            minLength = maxLength;
        }
    }
}
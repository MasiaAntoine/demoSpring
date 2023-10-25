package com.example.demoSpring.model.wizardModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Spec {
    @JsonProperty("max-length")
    private int maxLength;

    public Spec(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}

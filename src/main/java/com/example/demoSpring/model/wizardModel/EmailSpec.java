package com.example.demoSpring.model.wizardModel;

public class EmailSpec {
    private int maxLength;

    public EmailSpec(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}

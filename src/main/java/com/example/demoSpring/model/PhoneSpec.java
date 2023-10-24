package com.example.demoSpring.model;

public class PhoneSpec {
    private int maxLength;

    public PhoneSpec(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

}

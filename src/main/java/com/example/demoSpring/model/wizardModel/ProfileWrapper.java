package com.example.demoSpring.model.wizardModel;

public class ProfileWrapper {
    private Profile profile;

    public ProfileWrapper(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
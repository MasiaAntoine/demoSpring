package com.example.demoSpring.model.wizardModel;

public class ProfileWrapper {
    private WizardProfile profile;

    public ProfileWrapper(WizardProfile profile) {
        this.profile = profile;
    }

    public WizardProfile getProfile() {
        return profile;
    }

    public void setProfile(WizardProfile profile) {
        this.profile = profile;
    }
}
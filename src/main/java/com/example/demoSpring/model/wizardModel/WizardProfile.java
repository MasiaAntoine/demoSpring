package com.example.demoSpring.model.wizardModel;

public class WizardProfile {
    private EmailSpec email;
    private PhoneSpec phone;

    public WizardProfile(EmailSpec email, PhoneSpec phone) {
        this.email = email;
        this.phone = phone;
    }

    public EmailSpec getEmail() {
        return email;
    }

    public void setEmail(EmailSpec email) {
        this.email = email;
    }

    public PhoneSpec getPhone() {
        return phone;
    }

    public void setPhone(PhoneSpec phone) {
        this.phone = phone;
    }
}

package com.example.demoSpring.model.wizardModel;

public class Profile {
    private Spec email;
    private Spec phone;

    public Profile(Spec email, Spec phone) {
        this.email = email;
        this.phone = phone;
    }

    public Spec getEmail() {
        return email;
    }

    public void setEmail(Spec email) {
        this.email = email;
    }

    public Spec getPhone() {
        return phone;
    }

    public void setPhone(Spec phone) {
        this.phone = phone;
    }
}
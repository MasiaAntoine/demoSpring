package com.example.demoSpring.model;

public class WizardSpec {
    private String nom;
    private int age;

    // Constructeurs, getters, setters, etc.

    public WizardSpec(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

package com.example.demoSpring.model.wizard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Profile {
    private final Spec lastname;
    private final Spec firstname;
    private final Spec password;
    private final Spec email;
    private final Spec phone;
}
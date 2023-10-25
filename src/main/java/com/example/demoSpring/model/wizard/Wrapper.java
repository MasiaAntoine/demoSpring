package com.example.demoSpring.model.wizard;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Wrapper {
    private Profile profile;
    private Shop shop;
}
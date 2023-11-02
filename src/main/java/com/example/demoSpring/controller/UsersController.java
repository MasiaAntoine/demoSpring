package com.example.demoSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.UsersModel;
import com.example.demoSpring.repository.UsersRepository;

@RestController
@RequestMapping("/add")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/users")
    public UsersModel addUser() {
        UsersModel user = UsersModel.builder()
                .prenom("Antoine")
                .nom("Masia")
                .build();
        return usersRepository.save(user);
    }
}

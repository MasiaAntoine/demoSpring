package com.example.demoSpring.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpring.model.UsersModel;
import com.example.demoSpring.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/add")
    public UsersModel addUser(@RequestBody UsersModel user) {
        return usersRepository.save(user);
    }

    @GetMapping("/all")
    public List<UsersModel> getAllUsers() {
        return usersRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> deleteUser(@PathVariable Long id) {
        Optional<UsersModel> user = usersRepository.findById(id);
        Map<String, Object> response = new HashMap<>();
        if (user.isPresent()) {
            usersRepository.deleteById(id);
            response.put("status", HttpStatus.OK.value()); // 200
            response.put("message", "User deleted successfully");
            return ResponseEntity.ok(response);
        } else {
            response.put("status", HttpStatus.NOT_FOUND.value()); // 404
            response.put("message", "User not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
    }
}

package com.example.demoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpring.model.UsersModel;

public interface UsersRepository extends JpaRepository<UsersModel, Long> {
}
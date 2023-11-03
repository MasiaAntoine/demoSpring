package com.example.demoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSpring.model.UsersModel;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Long> {
}

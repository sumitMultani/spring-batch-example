package com.example.springbatchexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbatchexample.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

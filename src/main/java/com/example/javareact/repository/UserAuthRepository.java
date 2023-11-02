package com.example.javareact.repository;

import com.example.javareact.model.UserAuth;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {
    
    List<UserAuth>  findByName(String name);
}

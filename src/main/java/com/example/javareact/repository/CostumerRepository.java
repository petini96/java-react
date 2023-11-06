package com.example.javareact.repository;

import com.example.javareact.model.Costumer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Long> {

    List<Costumer>  findByName(String name);
}

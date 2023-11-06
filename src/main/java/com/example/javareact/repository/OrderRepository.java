package com.example.javareact.repository;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.Order;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order>  findAll();
    List<Order>  findByProductName(String productName);

    List<Order> findByCostumer(Costumer costumer);
}

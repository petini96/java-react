package com.example.javareact.service;

import java.util.List;
import java.util.Optional;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.Order;

public interface OrderService {
    List<Order>  findByProductName(String productName);
    List<Order>  findAll();
    Order save(Order order);
    List<Order> findByCostumer(Costumer costumer);
    Optional<Order> findById(Long id);
}



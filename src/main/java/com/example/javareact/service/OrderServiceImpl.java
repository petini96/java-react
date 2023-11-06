package com.example.javareact.service;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.Order; 
import com.example.javareact.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderServiceImpl implements OrderService {
    private final OrderRepository OrderRepository;

    public Order save(Order order) {
        log.info("Salvo no banco de dados");
        return this.OrderRepository.save(order);
    }

    public List<Order> findByProductName(String name) {
        log.info("Buscando no banco pelo nome");
        return this.OrderRepository.findByProductName(name);
    }
   
    public List<Order> findAll() {
        return this.OrderRepository.findAll();
    }

    public List<Order> findByCostumer(Costumer costumer) {
        return OrderRepository.findByCostumer(costumer);
    }
  
    public Optional<Order> findById(Long id) {
        return OrderRepository.findById(id);
    }
 
}

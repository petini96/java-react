package com.example.javareact.controller;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.Order;
import com.example.javareact.service.OrderService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/orders", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderController {
    private final OrderService orderService;
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Order save(@RequestBody Order order){
        return this.orderService.save(order);
    }

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findAll(){
        System.out.println();
        return this.orderService.findAll();
    }

    @GetMapping("/find/{productname}")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findByProductName(@PathVariable String productName){
        System.out.println(productName);
        return this.orderService.findByProductName(productName);
    }

    @GetMapping("/by-customer/{customerId}")
    public List<Order> getOrdersByCostumer(@PathVariable Long customerId) {
        Costumer customer = new Costumer();
        customer.setId(customerId); // Supondo que você tenha um método para buscar um cliente por ID
        return orderService.findByCostumer(customer);
    }

    
}

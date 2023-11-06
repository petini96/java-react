package com.example.javareact.service;

import java.util.List;

import com.example.javareact.model.Costumer;

public interface CostumerService {
    Costumer save(Costumer costumer);
    List<Costumer>  findByName(String name);
}

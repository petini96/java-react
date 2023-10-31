package com.example.javareact.service;

import com.example.javareact.model.Costumer;
import org.springframework.http.ResponseEntity;

public interface CostumerService {
    Costumer save(Costumer costumer);
}

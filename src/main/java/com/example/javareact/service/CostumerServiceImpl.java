package com.example.javareact.service;

import com.example.javareact.model.Costumer;
import com.example.javareact.repository.CostumerRepository;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CostumerServiceImpl implements CostumerService {
    private final CostumerRepository costumerRepository;
    public Costumer save(Costumer costumer) {
        log.info("Salvo no banco de dados");
        return this.costumerRepository.save(costumer);
    }
}

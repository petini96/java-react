package com.example.javareact.service;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.UserAuth;
import com.example.javareact.repository.CostumerRepository;

import java.util.List;

import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Costumer> findByName(String name) {
        log.info("Buscando no banco pelo nome");
        return this.costumerRepository.findByName(name);
    }
}

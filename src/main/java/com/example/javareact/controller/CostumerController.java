package com.example.javareact.controller;

import com.example.javareact.model.Costumer;
import com.example.javareact.model.UserAuth;
import com.example.javareact.service.CostumerService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/costumer", produces = { MediaType.APPLICATION_JSON_VALUE })
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CostumerController {
    private final CostumerService costumerService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Costumer save(@RequestBody Costumer costumer) {
        return this.costumerService.save(costumer);
    }

    @GetMapping("/find/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Costumer> findByName(@PathVariable String name) {
        System.out.println(name);
        return this.costumerService.findByName(name);
    }
}

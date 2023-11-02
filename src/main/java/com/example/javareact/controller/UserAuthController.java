package com.example.javareact.controller;

import com.example.javareact.model.UserAuth;
import com.example.javareact.service.UserAuthService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users", produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserAuthController {
    private final UserAuthService userAuthService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public UserAuth save(@RequestBody UserAuth userAuth){
        return this.userAuthService.save(userAuth);
    }

    @GetMapping("/find/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserAuth> findByName(@PathVariable String name){
        System.out.println(name);
        return this.userAuthService.findByName(name);
    }
}

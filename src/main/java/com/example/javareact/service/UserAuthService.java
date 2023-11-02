package com.example.javareact.service;

import java.util.List;

import com.example.javareact.model.UserAuth; 

public interface UserAuthService {
    UserAuth save(UserAuth userAuthAuth);
    List<UserAuth>  findByName(String name);
}

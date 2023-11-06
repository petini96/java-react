package com.example.javareact.service;

import com.example.javareact.model.UserAuth;
import com.example.javareact.repository.UserAuthRepository;

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
public class UserAuthServiceImpl implements UserAuthService {
    private final UserAuthRepository UserAuthRepository;
    public UserAuth save(UserAuth userAuth) {
        log.info("Salvo no banco de dados");
        return this.UserAuthRepository.save(userAuth);
    }

    public List<UserAuth> findByName(String name) {
        log.info("Buscando no banco pelo nome");
        return this.UserAuthRepository.findByName(name);
    }
 
}

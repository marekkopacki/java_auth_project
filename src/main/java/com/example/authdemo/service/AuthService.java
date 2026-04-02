package com.example.authdemo.service;

import org.springframework.stereotype.Service;
import com.example.authdemo.repository.UserRepository;

@Service
public class AuthService {
    private final UserRepository repo;

    public AuthService(UserRepository repo) {
        this.repo = repo;
    }
}

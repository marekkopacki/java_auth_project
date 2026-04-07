package com.example.authdemo.service;
import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.authdemo.model.User;
import com.example.authdemo.repository.UserRepository;
import com.example.authdemo.service.AuthService;

@SpringBootTest
public class AuthServiceGeneratedAiTests {

    @Autowired
    private AuthService authService;

    @Test
    public void testFindUserByUsername() {
        String username = "testUser";
        Optional<User> userOptional = authService.findUserByUsername(username);

        assertNotNull(userOptional, "User should not be null");
        User user = userOptional.orElse(null);
        assertEquals(username, user.getUsername(), "Username should match");
    }
}
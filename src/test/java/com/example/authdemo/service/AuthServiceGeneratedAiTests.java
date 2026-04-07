package com.example.authdemo.service;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.authdemo.model.User; // Make sure to import the User class
import com.example.authdemo.repository.UserRepository; // Make sure to import the UserRepository interface
import com.example.authdemo.service.AuthService; // Make sure to import the AuthService class
import org.junit.jupiter.api.Test;

public class AuthServiceGeneratedAiTests {

    @Test
    void testFindUserByUsername() {
        UserRepository userRepository = mock(UserRepository.class);
        AuthService authService = new AuthService(userRepository); // Update the constructor to take a UserRepository

        String username = "testUser";
        User user = authService.findUserByUsername(username); // Make sure the method name is correct

        assertNotNull(user, "User should not be null");
        assertEquals(username, user.getUsername(), "Username should match");
    }
}
package com.example.authdemo.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UserGeneratedAiTests {

    @PersistenceContext
    private EntityManager entityManager;

    @BeforeEach
    void setUp() {
        // Clear persisted entities before each test
        entityManager.clear();
    }

    @Test
    void shouldCreateUserWithValidData() {
        // Given
        String username = "testUser";
        String password = "password";
        String role = "USER";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRole(role);

        // When
        entityManager.persist(user);
        entityManager.flush();

        // Then
        assertNotNull(user.getId());
    }

    @Test
    void shouldNotCreateUserWithNullUsername() {
        // Given
        User user = new User();
        user.setPassword("password");
        user.setRole("USER");

        // When
        try {
            entityManager.persist(user);
            entityManager.flush();
            fail("Expected IllegalArgumentException for null username");
        } catch (IllegalArgumentException e) {
            assertMatches("Username must not be null", e.getMessage());
        }
    }

    @Test
    void shouldNotCreateUserWithNullPassword() {
        // Given
        User user = new User();
        user.setUsername("testUser");
        user.setRole("USER");

        // When
        try {
            entityManager.persist(user);
            entityManager.flush();
            fail("Expected IllegalArgumentException for null password");
        } catch (IllegalArgumentException e) {
            assertMatches("Password must not be null", e.getMessage());
        }
    }
}

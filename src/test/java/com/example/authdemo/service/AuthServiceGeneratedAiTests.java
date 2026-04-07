package com.example.authdemo.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.example.authdemo.model.User;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class AuthServiceGeneratedAiTests {

    private AuthService authService;
    private UserRepository repoMock;

    @BeforeEach
    void setUp() {
        // Mock the UserRepository
        repoMock = Mockito.mock(UserRepository.class);
        // Inject the mock into the AuthService
        authService = new AuthService(repoMock);
    }

    @Test
    void testAuthService_findUserByUsername() {
        // GIVEN: A mock UserRepository is created
        // WHEN: The AuthService attempts to find a user by username
        String username = "testUser";
        User user = new User();
        user.setUsername(username);
        Mockito.when(repoMock.findByUsername(username)).thenReturn(Mockito.any(User.class));

        // THEN: The AuthService returns the mocked user
        User foundUser = authService.getByUsername(username);

        // Assert that the returned user is the same as the mocked user
        assertThat(foundUser).isEqualTo(user);
    }

    @Test
    void testAuthService_getByUsername_userNotFound() {
        // GIVEN: A mock UserRepository is created
        // WHEN: The AuthService attempts to find a user by username
        String username = "nonExistentUser";

        // THEN: The AuthService returns an empty Optional
        Mockito.doNothing().when(repoMock.findByUsername(username));

        // Assert that the AuthService returns an empty Optional
        User foundUser = authService.getByUsername(username);
        assertThat(foundUser).isNull();
    }
}

package com.example.authdemo.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class AuthServiceGeneratedAiTests {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @BeforeEach
    public void setup() {
        // Reset the mock repository before each test
        reset(userRepository);
    }

    @Test
    public void testFindUserByUsername() {
        // GIVEN
        String username = "test_username";
        User user = new User();
        user.setUsername(username);
        when(userRepository.findByUsername(username)).thenReturn(java.util.Optional.of(user));

        // WHEN
        User resultUser = authService.findUserByUsername(username);

        // THEN
        assertThat(resultUser).isNotNull();
        assertThat(resultUser.getUsername()).isEqualTo(username);
        verify(userRepository, times(1)).findByUsername(username);
    }
}

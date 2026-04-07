package com.example.authdemo;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

import java.util.ArrayList;
import java.util.List;

class AuthDemoApplicationGeneratedAiTests {

    @Mock
    private AuthDemo authDemo;

    @BeforeEach
    void setUp() {
        PowerMockito.mockStatic(AuthDemoApplication.class);
        Mockito.reset(authDemo);
    }

    @Test
    void testMain() {
        // GIVEN: No preconditions set for the main method.
        // WHEN: SpringApplication.run() is called with AuthDemoApplication.class and null args.
        // THEN: SpringApplication.run() should return a SpringApplication instance.
        SpringApplication application = Mockito.mock(SpringApplication.class);
        PowerMockito.when(SpringApplication.run(AuthDemoApplication.class, null)).thenReturn(application);
        SpringApplication.run(AuthDemoApplication.class, null);
    }
}

package com.example.authdemo;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class AuthDemoApplicationGeneratedAiTests {

    private AuthDemoApplication application;
    private MockitoMocker mocker;

    @BeforeEach
    void setup() {
        this.mocker = new MockitoMocker(this);
        this.application = this.mocker.getMockOf(AuthDemoApplication.class);
    }

    @Test
    void givenApp_whenSayHello_thenReturnsExpectedMessage() {
        // GIVEN
        String expectedMessage = "Hello, World!";
        when(application.sayHello()).thenReturn(expectedMessage);

        // WHEN
        String actualMessage = application.sayHello();

        // THEN
        assertEquals(expectedMessage, actualMessage);
    }
}

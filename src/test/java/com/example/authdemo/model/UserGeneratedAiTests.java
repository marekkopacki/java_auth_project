package com.example.authdemo.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UserGeneratedAiTests {

    @Mock
    private User user;

    @BeforeEach
    void setup() {
        // Reset the state of the user object before each test
    }

    @Test
    void givenUser_whenGetId_thenReturnCorrectId() {
        // GIVEN
        Long expectedId = 1L;
        user.setId(expectedId);

        // WHEN
        Long actualId = user.getId();

        // THEN
        assertThat(actualId).isEqualTo(expectedId);
    }

    @Test
    void givenUser_whenGetUsername_thenReturnCorrectUsername() {
        // GIVEN
        String expectedUsername = "testUser";
        user.setUsername(expectedUsername);

        // WHEN
        String actualUsername = user.getUsername();

        // THEN
        assertThat(actualUsername).isEqualTo(expectedUsername);
    }

    @Test
    void givenUser_whenGetPassword_thenReturnCorrectPassword() {
        // GIVEN
        String expectedPassword = "testPassword";
        user.setPassword(expectedPassword);

        // WHEN
        String actualPassword = user.getPassword();

        // THEN
        assertThat(actualPassword).isEqualTo(expectedPassword);
    }

    @Test
    void givenUser_whenGetRole_thenReturnCorrectRole() {
        // GIVEN
        String expectedRole = "admin";
        user.setRole(expectedRole);

        // WHEN
        String actualRole = user.getRole();

        // THEN
        assertThat(actualRole).isEqualTo(expectedRole);
    }
}

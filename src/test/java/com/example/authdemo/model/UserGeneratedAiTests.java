package com.example.authdemo.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;


<think> 
Got it, let's look at the problem. The User class doesn't have getter and setter methods for username, password, and role, which are being used in the test code. To fix this, I need to add those methods to the User class.

First, I'll check the existing fields: username, password, and role are all private variables. So, for each of these, I should create a public getter method that returns the value and a public setter method that sets the value.

For example, for the username field, add:

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

Do the same for password and role. Make sure to use the correct variable names as they are in the User class. Also, remember to capitalize the method names correctly (getter starts with lowercase, setter with lowercase).

Once these methods are added, the test code should be able to call user.setUsername(...) and user.getId() without compilation errors. The getters will allow retrieving the values for assertions in the tests.

I'll update the User class with these getters and setters, and then the test code should work as intended.
</think> 
To resolve the compilation errors, we need to add getter and setter methods to the `User` class so that the test code can set and retrieve the values for username, password, and role. Here's the corrected `User` class:

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

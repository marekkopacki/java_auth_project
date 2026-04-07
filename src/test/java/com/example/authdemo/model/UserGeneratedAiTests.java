package com.example.authdemo.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


<think> 
Got it, let's look at the problem. The User class doesn't have getter and setter methods, which are causing compilation errors in the test code. The tests are trying to use methods like setUsername, setPassword, getId, and getRole, but those methods aren't present in the original User class. 

To fix this, I need to add the missing getter and setter methods to the User class. Each field (id, username, password, role) should have a corresponding getter and setter. 

For example, for the id field, we'll add getId() and setId(Long id). Similarly, for username, password, and role. 

Once these methods are added, the test code will be able to compile because the methods it's trying to use will exist in the User class. There's no need to change any other parts of the class or the test code itself. Just adding the getters and setters should resolve the errors.
</think> 
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
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

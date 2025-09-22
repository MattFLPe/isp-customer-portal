package com.project.customerportal.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Login;
    private String Password;
    private boolean Status;

    public User(Long id, String login, String password, boolean status) {
        Id = id;
        Login = login;
        Password = password;
        Status = status;
    }

    public User() {

    }

    public void setId(Long id) {
        Id = id;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}

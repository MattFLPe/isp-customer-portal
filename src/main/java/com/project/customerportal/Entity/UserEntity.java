package com.project.customerportal.Entity;

import lombok.Getter;

@Getter
public class UserEntity {
    private Long Id;
    private String Login;
    private String Password;
    private boolean Status;

    public UserEntity(Long id, String login, String password, boolean status) {
        Id = id;
        Login = login;
        Password = password;
        Status = status;
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

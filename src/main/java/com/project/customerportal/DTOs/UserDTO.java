package com.project.customerportal.DTOs;

import lombok.Getter;

@Getter
public class UserDTO {
    private String Login;
    private String Password;

    public boolean status;

    public UserDTO(String login, String password, boolean status) {
        Login = login;
        Password = password;
        this.status = status;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

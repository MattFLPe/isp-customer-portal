package com.project.customerportal.DTOs;

public class UserDTO {
    public long Id;
    public String Name;
    public boolean status;

    public UserDTO(long id, String name, boolean status) {
        Id = id;
        Name = name;
        this.status = status;
    }
}

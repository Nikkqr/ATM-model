package com.bank.Entities;

import lombok.Data;

@Data
public class SecUserRequest {

    private String name;

    private String login;

    private int age;

    private String gender;

    private HairColor hairColor;

    private String password;

    private Role role;

    public SecUserRequest() {}
}

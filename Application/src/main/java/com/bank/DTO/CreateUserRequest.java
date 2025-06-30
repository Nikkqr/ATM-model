package com.bank.DTO;

import com.bank.Entities.Friends;
import com.bank.Entities.HairColors;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class CreateUserRequest {

    private String login;

    private String name;

    private int age;

    private String gender;

    private HairColors hairColor;
}

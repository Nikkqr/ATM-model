package com.bank.DTO;

import com.bank.Entities.Friends;
import com.bank.Entities.HairColors;
import lombok.Data;

import java.util.List;

/**
 * дто для пользователя
 */
@Data
public class UserDTO {

    private int id;

    private String login;

    private String name;

    private int age;

    private String gender;

    private String hairColor;

    public UserDTO() {}

    public UserDTO(int id, String login, String name, int age, String gender, HairColors hairColor) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor.toString();
    }
}

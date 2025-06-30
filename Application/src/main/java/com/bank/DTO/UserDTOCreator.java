package com.bank.DTO;

import com.bank.Entities.User;

/**
 * Класс для создания дто пользователя
 */
public class UserDTOCreator {
    public static UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getLogin(),
                user.getName(),
                user.getAge(),
                user.getGender(),
                user.getHairColor()
        );
    }
}

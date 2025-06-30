package com.bank.Entities;

public class UserRequestCreator {

    public static UserRequest createUserRequest(SecUserRequest securityUser) {
        return new UserRequest(
        securityUser.getLogin(),
        securityUser.getName(),
        securityUser.getAge(),
        securityUser.getGender(),
        securityUser.getHairColor());
    }
}

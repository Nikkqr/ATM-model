package com.bank.DTO;

import lombok.Data;

@Data
public class AccountDTO {

    private int id;

    private Double balance;

    private String login;

    private int ownerId;
}

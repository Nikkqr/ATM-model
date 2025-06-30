package com.bank.DTO;

import com.bank.Entities.Operation;
import lombok.Data;

import java.util.List;

@Data
public class CreateAccountRequest {

    private Double balance;

    private String login;

    private int ownerId;
}

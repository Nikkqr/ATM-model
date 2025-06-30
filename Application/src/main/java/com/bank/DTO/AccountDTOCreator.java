package com.bank.DTO;

import com.bank.Entities.Account;

/**
 * Класс для создания дто счёта
 */
public class AccountDTOCreator {
    public static AccountDTO toDTO(Account account) {
        return new AccountDTO(
                account.getId(),
                account.getBalance(),
                account.getLogin(),
                account.getOwnerId()
        );
    }
}

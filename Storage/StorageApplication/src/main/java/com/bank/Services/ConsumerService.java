package com.bank.Services;

import com.bank.Events.AccountEvent;
import com.bank.Events.UserEvent;
import com.bank.Repository.AccountEventRepository;
import com.bank.Repository.UserEventRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private final UserEventRepository userRepo;
    private final AccountEventRepository accountRepo;

    public ConsumerService(UserEventRepository clientRepo, AccountEventRepository accountRepo) {
        this.userRepo = clientRepo;
        this.accountRepo = accountRepo;
    }

    public void saveUserEvent(String key, String value) {
        UserEvent event = new UserEvent(key, value);
        userRepo.createUserEvent(event);
    }

    public void saveAccountEvent(String key, String value) {
        AccountEvent event = new AccountEvent(key, value);
        accountRepo.createAccountEvent(event);
    }
}

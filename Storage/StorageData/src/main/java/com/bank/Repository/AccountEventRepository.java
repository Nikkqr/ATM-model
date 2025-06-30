package com.bank.Repository;

import com.bank.Events.AccountEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEventRepository extends JpaRepository<AccountEvent, Integer>
{
    default void createAccountEvent(AccountEvent account) {
        save(account);
    }
}

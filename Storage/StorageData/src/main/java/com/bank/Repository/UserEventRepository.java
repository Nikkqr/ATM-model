package com.bank.Repository;

import com.bank.Events.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEventRepository extends JpaRepository<UserEvent, Integer>
{
    default void createUserEvent(UserEvent user) {
        save(user);
    }
}

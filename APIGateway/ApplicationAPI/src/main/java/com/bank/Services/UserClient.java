package com.bank.Services;

import com.bank.Entities.AccountDTO;
import com.bank.Entities.HairColor;
import com.bank.Entities.Role;
import com.bank.Entities.SecUserRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserClient {

    ResponseEntity<String> createUser(SecUserRequest userRequest);

    int getCurrentUserId();

    ResponseEntity<String> getFilterUsers(HairColor hairColor, String gender);

    ResponseEntity<String> getUserInfo(int id);

    ResponseEntity<String> getAccounts();

    ResponseEntity<List<AccountDTO>> getAccounts(int id);

    ResponseEntity<String> accountById(int id, String type, String acc);
}

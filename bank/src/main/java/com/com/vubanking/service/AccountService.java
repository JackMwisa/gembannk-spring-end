package com.vubanking.service;

import com.vubanking.model.Account;
import com.vubanking.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAccountsByUser(Long userId) {
        return accountRepository.findByUserId(userId);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}

package com.vubanking.controller;

public class AccountController {
    
}
package com.vubanking.controller;

import com.vubanking.model.Account;
import com.vubanking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/user/{userId}")
    public List<Account> getAccountsByUser(@PathVariable Long userId) {
        return accountService.getAccountsByUser(userId);
    }
}

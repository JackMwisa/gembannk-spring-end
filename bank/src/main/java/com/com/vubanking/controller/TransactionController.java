package com.vubanking.controller;

import com.vubanking.model.Transaction;
import com.vubanking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping("/create")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/account/{accountId}")
    public List<Transaction> getTransactionsByAccount(@PathVariable Long accountId) {
        return transactionService.getTransactionsByAccount(accountId);
    }
}

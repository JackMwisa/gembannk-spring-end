package com.vubanking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private Double amount;
    private String transactionType; // e.g., Deposit, Withdrawal, Transfer
    private String recipientAccount;

    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate = new Date();
}

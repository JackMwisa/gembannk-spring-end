package com.vubanking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String accountNumber;
    private String accountType;
    private Double balance;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}

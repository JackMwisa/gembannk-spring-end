package com.vubanking.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String passwordHash;
    private String phoneNumber;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();
}

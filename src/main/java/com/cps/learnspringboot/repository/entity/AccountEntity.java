package com.cps.learnspringboot.repository.entity;

import com.cps.learnspringboot.controller.request.AccountCreateRequest;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "accounts")
public class AccountEntity {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "account_seq", sequenceName = "account_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "account_number", unique = true, nullable = false)
    private String accountNumber;
    @Column(name = "account_holder_name", nullable = false)
    private String accountHolderName;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    // Constructors
    public AccountEntity() {}
    public AccountEntity(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
    }
    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public void updateAccount(AccountEntity account, AccountCreateRequest updatedAccount) {
        account.accountNumber = updatedAccount.getAccountNumber();
        account.accountHolderName = updatedAccount.getAccountHolderName();
        account.accountType = updatedAccount.getAccountType();
    }

    public void setId(Long id) { this.id = id; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public void setAccountType(String accountType) { this.accountType = accountType; }

}

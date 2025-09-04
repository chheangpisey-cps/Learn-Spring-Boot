package com.cps.learnspringboot.dto;

import com.cps.learnspringboot.repository.entity.AccountEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;
    @NotBlank
    private String accountHolderName;
    @NotBlank
    private String accountNumber;
    @NotBlank
    private String accountType;
    private BigDecimal balance;

    public AccountEntity toAccount() {
        return new AccountEntity(id, accountHolderName, accountNumber, accountType, balance);
    }

    public AccountEntity updateAccount(AccountEntity account) {
        account.setAccountHolderName(accountHolderName);
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setAccountBalance(balance);
        return account;
    }
}

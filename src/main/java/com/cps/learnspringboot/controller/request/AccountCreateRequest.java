package com.cps.learnspringboot.controller.request;

import com.cps.learnspringboot.repository.entity.AccountEntity;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class AccountCreateRequest {
    String accountNumber;
    String accountHolderName;
    String accountType;
    BigDecimal balance;

    public AccountEntity toAccountEntity() {
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccountNumber(accountNumber);
        accountEntity.setAccountHolderName(accountHolderName);
        accountEntity.setAccountType(accountType);
        accountEntity.setAccountBalance(balance);
        return accountEntity;
    }
}

package com.cps.learnspringboot.services;

import com.cps.learnspringboot.controller.request.AccountCreateRequest;
import com.cps.learnspringboot.repository.entity.AccountEntity;
import org.springframework.data.domain.Page;

public interface AccountService {
    AccountEntity saveAccount(AccountEntity accountEntity);
    Page<AccountEntity> findAll();
    AccountEntity updateAccount(Long id, AccountCreateRequest accountEntity);

    void deleteAccount(Long id);
}

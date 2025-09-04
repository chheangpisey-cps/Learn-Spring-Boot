package com.cps.learnspringboot.services.implementation;

import com.cps.learnspringboot.controller.exception.ApiErrorException;
import com.cps.learnspringboot.controller.exception.ResourceNotFoundException;
import com.cps.learnspringboot.controller.request.AccountCreateRequest;
import com.cps.learnspringboot.repository.AccountRepository;
import com.cps.learnspringboot.repository.entity.AccountEntity;
import com.cps.learnspringboot.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImp implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountEntity createAccount(AccountEntity request) {
        return accountRepository.save(request);
    }

    @Override
    public AccountEntity getAccountDetail(Long id) {
        return accountRepository.findById(id).orElseThrow(() -> new ApiErrorException(404, "Account not found"));
    }

    @Override
    public AccountEntity saveAccount(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    @Override
    public Page<AccountEntity> findAll() {
        final var pageable = PageRequest.of(0, 10);

        return accountRepository.findAll(pageable);
    }

    @Override
    public AccountEntity updateAccount(Long id, AccountCreateRequest accountEntity) {
//        var account = accountRepository.findById(id).orElse(null);
//        assert account != null;
//        account.updateAccount(account, accountEntity);
        var account = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(404, "Account id [%s] not existing."));
        account.updateAccount(account, accountEntity);
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

}

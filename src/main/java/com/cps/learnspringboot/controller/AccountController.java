package com.cps.learnspringboot.controller;

import com.cps.learnspringboot.annotations.AuditFilter;
import com.cps.learnspringboot.controller.request.AccountCreateRequest;
import com.cps.learnspringboot.controller.response.ObjectResponse;
import com.cps.learnspringboot.dto.AccountDto;
import com.cps.learnspringboot.repository.entity.AccountEntity;
import com.cps.learnspringboot.services.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping
    public ObjectResponse<AccountEntity> createAccount(@Valid @RequestBody AccountDto accountDto) {
        return new ObjectResponse<>(accountService.createAccount(accountDto.toAccount()));
    }

//    @PostMapping
//    public ResponseEntity<AccountEntity> createAccount(@RequestBody AccountCreateRequest body) {
//        final var request = body.toAccountEntity();
//        final var result = accountService.saveAccount(request);
//        return ResponseEntity.ok().body(result);
//    }

    @AuditFilter()
    @GetMapping
    public ResponseEntity<Page<AccountEntity>> getAccount() {
        final var result = accountService.findAll();
        return ResponseEntity.ok(result);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountEntity> updateAccount(@PathVariable Long id,  @RequestBody AccountCreateRequest body) {
        final var result = accountService.updateAccount(id, body);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAccount(@PathVariable Long id) {
        var mapMessage = new HashMap<String, String>();
        accountService.deleteAccount(id);
        mapMessage.put("message", "Account deleted successfully");
        return ResponseEntity.ok().body(mapMessage);
    }

}

package com.cps.learnspringboot.controller.response;

import java.time.LocalDateTime;

public class AccountResponse {
    private Long id;
    private String accountType;
    private String accountHolderName;
    private String accountNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

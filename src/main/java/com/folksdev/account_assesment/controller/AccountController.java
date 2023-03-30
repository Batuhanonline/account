package com.folksdev.account_assesment.controller;

import com.folksdev.account_assesment.dto.AccountDto;
import com.folksdev.account_assesment.dto.CreateAccountRequest;
import com.folksdev.account_assesment.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@Valid @RequestBody CreateAccountRequest request) {
        return
                ResponseEntity.ok(accountService.createAccount(request));
    }
}

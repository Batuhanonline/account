package com.folksdev.account_assesment.service;

import com.folksdev.account_assesment.dto.AccountDto;
import com.folksdev.account_assesment.dto.AccountDtoConverter;
import com.folksdev.account_assesment.dto.CreateAccountRequest;
import com.folksdev.account_assesment.model.Account;
import com.folksdev.account_assesment.model.Customer;
import com.folksdev.account_assesment.model.Transaction;
import com.folksdev.account_assesment.repository.AccountReporsitory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountService {

    private final AccountReporsitory accountReporsitory;
    private final CustomerService customerService;
    private final AccountDtoConverter converter;

    public AccountService(AccountReporsitory accountReporsitory,
                          CustomerService customerService,
                          AccountDtoConverter converter) {
        this.accountReporsitory = accountReporsitory;
        this.customerService = customerService;
        this.converter = converter;
    }

    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account = new Account(customer,
                createAccountRequest.getInitialCredit(),
                LocalDateTime.now()
                );

        if (createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO) > 0) {
            //Transaction transaction = transactionService.initiateMoney(account, createAccountRequest.getInitialCredit()); ////////////
            Transaction transaction = new Transaction(createAccountRequest.getInitialCredit(), account);
            account.getTransaction().add(transaction);
        }

        return converter.convert(accountReporsitory.save(account));
    }

}

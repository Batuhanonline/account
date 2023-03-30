package com.folksdev.account_assesment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFoundExeption extends RuntimeException{

    public CustomerNotFoundExeption(String message) {
        super(message);
    }
}

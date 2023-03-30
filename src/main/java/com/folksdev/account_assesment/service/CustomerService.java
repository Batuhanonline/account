package com.folksdev.account_assesment.service;

import com.folksdev.account_assesment.dto.CustomerDto;
import com.folksdev.account_assesment.dto.CustomerDtoConverter;
import com.folksdev.account_assesment.exception.CustomerNotFoundExeption;
import com.folksdev.account_assesment.model.Customer;
import com.folksdev.account_assesment.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter) {
        this.customerRepository = customerRepository;
        this.customerDtoConverter = customerDtoConverter;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() ->
                new CustomerNotFoundExeption("Customer could not find by id: " + id));
    }

    public CustomerDto getCustomerById(String customerId) {
        return customerDtoConverter.convertToCustomerDto(findCustomerById(customerId));
    }
}

package com.folksdev.account_assesment.repository;

import com.folksdev.account_assesment.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}

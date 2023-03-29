package com.folksdev.account_assesment.repository;

import com.folksdev.account_assesment.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}

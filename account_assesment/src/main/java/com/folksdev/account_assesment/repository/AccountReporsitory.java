package com.folksdev.account_assesment.repository;

import com.folksdev.account_assesment.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountReporsitory extends JpaRepository<Account, String> {
}

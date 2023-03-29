package com.folksdev.account_assesment.dto

data class CustomerDto(
        val id: String,
        val name: String,
        val surname: String,
        val accounts: Set<CustomerAccountDto>
)

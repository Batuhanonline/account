package com.folksdev.account_assesment.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(
        val id: String?,
        val balance: BigDecimal?,
        val cretionDate: LocalDateTime?,
        val customer: AccountCustomerDto?,
        val transaction: Set<TransactionDto>?
)

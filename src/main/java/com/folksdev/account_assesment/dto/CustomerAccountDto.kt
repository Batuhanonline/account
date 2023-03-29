package com.folksdev.account_assesment.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class CustomerAccountDto(
        val id: String,
        val balace: BigDecimal? = BigDecimal.ZERO,
        val transactions: Set<TransactionDto>?,
        val creationDate: LocalDateTime
)

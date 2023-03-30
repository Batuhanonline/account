package com.folksdev.account_assesment.dto

import com.folksdev.account_assesment.model.TransactionType
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id: String?,
        val transactionType: TransactionType? = TransactionType.INITAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?
) {

}

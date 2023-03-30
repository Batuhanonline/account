package com.folksdev.account_assesment.dto

import java.math.BigDecimal

data class CreateAccountRequest (
        val customerId: String,
        val initialCredit: BigDecimal
)
package com.kotlin.project.banks.datasource.mock

import com.kotlin.project.banks.datasource.BankDataSource
import com.kotlin.project.banks.model.Bank
import org.springframework.stereotype.Repository

@Repository
//implements in Kotlin can be done with ":"
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("2345", 3.14, 200),
        Bank("4444", 4.14, 700),
        Bank("3333", 8.14, 900),
        Bank("6356", 7.14, 500)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
//    override fun getBanks(): Collection<Bank> {
//        return banks
//    }
}
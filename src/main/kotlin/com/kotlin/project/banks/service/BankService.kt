package com.kotlin.project.banks.service

import com.kotlin.project.banks.datasource.BankDataSource
import com.kotlin.project.banks.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService (private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }

}
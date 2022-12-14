package com.kotlin.project.banks.datasource

import com.kotlin.project.banks.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}
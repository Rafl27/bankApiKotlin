package com.kotlin.project.banks.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{

    private val mockDataSource = MockBankDataSource()
    @Test
    fun `should provide a collection of banks` () {
        //given

        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        Assertions.assertThat(banks).isNotEmpty
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun `should provide some mock data` () {
        //given

        //when
        val banks = mockDataSource.retrieveBanks()

        //then
        assertThat(banks).allMatch {it.accountNumber.isNotBlank()}
        assertThat(banks).anyMatch {it.trust != 0.0}
        assertThat(banks).allMatch {it.transactionFee != 0}
        //TODO assertThat(banks). accountNumbers are all different
    }

}
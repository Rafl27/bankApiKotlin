package com.kotlin.project.banks.model

//the constructor in Kotlin is built from parameters in the class, also, the getters and setters are automatically created, fields also don`t need to be private, since kotlin exposes the getters and setters as public.
data class Bank(val accountNumber: String, val trust: Double, val transactionFee: Int) {}
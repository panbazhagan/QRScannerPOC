package com.example.demoverifyapp.domain

import com.example.demoverifyapp.data.AccountRepository

class Authenticator(
    private val accountRepository: AccountRepository = AccountRepository()
) {

    fun getAccounts(): List<Account> {
        TODO("Get accounts from repo")
    }

    fun addAccount(account: Account) {
        TODO("Persist account in repo")
    }

    fun removeAccount(account: Account) {
        TODO("Remove account in repo")
    }
}
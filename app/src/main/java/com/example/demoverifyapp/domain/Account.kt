package com.example.demoverifyapp.domain

/**
 * Account is the root domain model in the context of TOTP pin generation holding information such as
 * 1. Name -> Name of the account
 * 2. Secret -> Secret key to generate TOTP
 */
class Account(
    val name: String,
    val secretKey: String,
    val issuer: String
) {

    fun generateTotp(): Totp {
        TODO("Generate TOTP based on the secret key")
    }

}
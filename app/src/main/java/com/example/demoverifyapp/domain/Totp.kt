package com.example.demoverifyapp.domain

class Totp(
    val pin: String,
    val expiry: Long
)
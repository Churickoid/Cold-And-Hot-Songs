package com.churickoid.coldandhot.data.retrofit.entity.account

data class TokenInfo(
    val accessToken: String,
    val expiresIn: Int,
    val tokenType: String
)
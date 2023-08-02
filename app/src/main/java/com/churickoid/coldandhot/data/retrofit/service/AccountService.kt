package com.churickoid.coldandhot.data.retrofit.service

import com.churickoid.coldandhot.data.retrofit.entity.account.TokenInfo
import retrofit2.http.POST
import retrofit2.http.Query

interface AccountService {
    @POST("api/token")
    suspend fun getAccessToken(
        @Query("client_id") clientId: String,
        @Query("client_secret") clientSecret: String,
    ) : TokenInfo
}
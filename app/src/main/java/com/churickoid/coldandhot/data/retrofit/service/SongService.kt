package com.churickoid.coldandhot.data.retrofit.service

import retrofit2.http.GET
import retrofit2.http.POST

interface SongService {

    //client id - 5aa6f154576b4979a7ff7d9b4dbfcffb
    //client secret - f7941b027abe4d06860b066f029e1abe
    @POST("api/token")
    suspend fun getAccessToken()

    @GET("api/")
    suspend fun getSongById()

}
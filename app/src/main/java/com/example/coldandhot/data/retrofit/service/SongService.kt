package com.example.coldandhot.data.retrofit.service

import retrofit2.http.GET

interface SongService {

    @GET("api/")
    suspend fun getSongById()

}
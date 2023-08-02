package com.churickoid.coldandhot.data.retrofit.service

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface SongService {

    @GET("v1/artists/{id}")
    suspend fun getSongById(
        @Header("Authorization") token: String,
        @Path("id") trackId: String
    ): String

}
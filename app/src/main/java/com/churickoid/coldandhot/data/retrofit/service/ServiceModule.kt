package com.churickoid.coldandhot.data.retrofit.service

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    fun provideSongService(retrofit: Retrofit): SongService{
        return retrofit.create(SongService::class.java)
    }
}
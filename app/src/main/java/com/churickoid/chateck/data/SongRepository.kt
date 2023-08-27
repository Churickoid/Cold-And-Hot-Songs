package com.churickoid.chateck.data

import com.churickoid.chateck.data.retrofit.service.AccountService
import com.churickoid.chateck.data.retrofit.service.SongService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SongRepository @Inject constructor(
    private val accountService: AccountService,
    private val songService: SongService
) {

    private var token: String? = null

    suspend fun getAccountToken(): String {
        if (token == null) {
            val tokenInfo = accountService.getAccessToken(
                "5aa6f154576b4979a7ff7d9b4dbfcffb",
                "f7941b027abe4d06860b066f029e1abe"
            )
            token = "${tokenInfo.tokenType} ${tokenInfo.accessToken}"
        }
        return token!!
    }

    suspend fun getSongById(songId: String): String {
        return songService.getSongById(getAccountToken(), songId)
    }
}
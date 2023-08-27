package com.churickoid.chateck.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.churickoid.chateck.data.SongRepository
import com.churickoid.chateck.domain.entity.MainUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val songRepository: SongRepository): ViewModel() {

    private val _uiState = MutableStateFlow(MainUIState("",""))
    val uiState: StateFlow<MainUIState> = _uiState.asStateFlow()

    fun authorize(){
        viewModelScope.launch {
            val token = songRepository.getAccountToken()
            val songInfo = songRepository.getSongById("4Z8W4fKeB5YxbusRsdQVPb")
            _uiState.value =  MainUIState(token,songInfo)
        }

    }
}
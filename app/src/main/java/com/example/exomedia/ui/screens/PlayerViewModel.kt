package com.example.exomedia.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.example.exomedia.data.repository.VideoListRepository
import com.example.exomedia.utils.PlayerUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class PlayerViewModel @Inject constructor(
    private val repository: VideoListRepository
) : ViewModel() {

    private val _playerState = MutableStateFlow<ExoPlayer?>(null)
    val playerState: StateFlow<ExoPlayer?> = _playerState

    fun getVideoList(key: String, videoType: String) =
        repository.getVideoList(key, videoType)

    fun createPlayerWithMediaItems(context: Context) {
        if (_playerState.value == null) {
            val mediaItem = MediaItem.Builder().setUri(PlayerUtils.Video_1).build()
            _playerState.update {
                ExoPlayer.Builder(context).build().apply {
                    setMediaItem(mediaItem)
                    prepare()
                    playWhenReady = true
                }
            }
        }
    }
}
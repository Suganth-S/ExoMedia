package com.example.exomedia.data.repository

import com.example.exomedia.data.api.NetworkHelper
import com.example.exomedia.data.model.VideoListResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class VideoListRepository @Inject constructor(val networkHelper: NetworkHelper) {
    fun getVideoList(key: String, videoType: String): Flow<VideoListResponse?> {
        return flow {
            emit(networkHelper.getVideoList(key, videoType))
        }.map { it.body() }
    }
}

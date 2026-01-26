package com.example.exomedia.data.api

import com.example.exomedia.data.model.VideoListResponse
import retrofit2.Response

interface NetworkHelper {
    suspend fun getVideoList(
        key: String,
        videoType: String
    ): Response<VideoListResponse>
}
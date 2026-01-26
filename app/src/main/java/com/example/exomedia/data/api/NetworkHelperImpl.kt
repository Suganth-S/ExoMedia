package com.example.exomedia.data.api

import com.example.exomedia.data.model.VideoListResponse
import retrofit2.Response
import javax.inject.Inject

class NetworkHelperImpl @Inject constructor(private val networkService: NetworkService) :
    NetworkHelper {
    override suspend fun getVideoList(
        key: String,
        videoType: String
    ): Response<VideoListResponse> {
        return networkService.getVideoList(key, videoType)
    }

}
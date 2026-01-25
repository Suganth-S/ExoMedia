package com.example.exomedia.data.api

import com.example.exomedia.data.model.VideoListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {

    @GET("api/videos/")
    suspend fun getVideoList(
        @Query("key") key: String,
        @Query("q") videoType: String
    ): Response<VideoListResponse>
}
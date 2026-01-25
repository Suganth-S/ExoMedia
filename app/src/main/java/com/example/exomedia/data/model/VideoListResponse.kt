package com.example.exomedia.data.model

data class VideoListResponse(
    val total: Int,
    val totalHits: Int,
    val hits: List<VideoHitModel>
)


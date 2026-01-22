package com.example.exomedia.data.model

data class VideoSearchResponse(
    val total: Int,
    val totalHits: Int,
    val hits: List<VideoHitModel>
)


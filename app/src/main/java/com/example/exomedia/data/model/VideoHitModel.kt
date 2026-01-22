package com.example.exomedia.data.model

data class VideoHitModel(
    val id: Int,
    val pageURL: String,
    val type: String,
    val tags: String,
    val duration: Int,
    val videos: VideoVariants,
    val views: Int,
    val downloads: Int,
    val likes: Int,
    val comments: Int,
    val user_id: Int,
    val user: String,
    val userImageURL: String,
    val noAiTraining: Boolean,
    val isAiGenerated: Boolean,
    val isGRated: Boolean,
    val isLowQuality: Boolean,
    val userURL: String
)

data class VideoVariants(
    val large: VideoFile,
    val medium: VideoFile,
    val small: VideoFile,
    val tiny: VideoFile
)

data class VideoFile(
    val url: String,
    val width: Int,
    val height: Int,
    val size: Long,
    val thumbnail: String
)



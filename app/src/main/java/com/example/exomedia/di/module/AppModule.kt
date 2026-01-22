package com.example.exomedia.di.module

import com.example.exomedia.utils.AppConstant.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient() {

    }

    @Provides
    fun provideBaseUrl() = BASE_URL

}
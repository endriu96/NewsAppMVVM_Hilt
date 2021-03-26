package com.newsappmaster.presentation.di

import com.newsappmaster.data.api.NewsAPIService
import com.newsappmaster.data.repository.dataSource.NewsRemoteDataSource
import com.newsappmaster.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *
 * Dependency module for RemoteDataSource
 */

@InstallIn(SingletonComponent::class)
@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(
        newsAPIService: NewsAPIService
    ): NewsRemoteDataSource {
        return NewsRemoteDataSourceImpl(newsAPIService)
    }

}
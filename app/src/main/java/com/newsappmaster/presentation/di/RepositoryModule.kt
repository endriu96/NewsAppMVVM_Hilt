package com.newsappmaster.presentation.di

import com.newsappmaster.data.repository.NewsRepositoryImpl
import com.newsappmaster.data.repository.dataSource.NewsRemoteDataSource
import com.newsappmaster.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 *
 *
 * Dependency module for NewsRepositoryImpl
 */
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }

}
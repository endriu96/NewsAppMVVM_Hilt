package com.newsappmaster.domain.usecase

import com.newsappmaster.data.model.Article
import com.newsappmaster.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase (private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}
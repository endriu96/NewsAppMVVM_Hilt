package com.newsappmaster.domain.usecase

import com.newsappmaster.data.model.Article
import com.newsappmaster.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.saveNews(article)
}
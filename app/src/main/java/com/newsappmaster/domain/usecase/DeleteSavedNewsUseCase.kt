package com.newsappmaster.domain.usecase

import com.newsappmaster.data.model.Article
import com.newsappmaster.domain.repository.NewsRepository

class DeleteSavedNewsUseCase (private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}
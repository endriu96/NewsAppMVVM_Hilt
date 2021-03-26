package com.newsappmaster.domain.usecase

import com.newsappmaster.data.model.APIResponse
import com.newsappmaster.data.util.Resource
import com.newsappmaster.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse> {
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }
}
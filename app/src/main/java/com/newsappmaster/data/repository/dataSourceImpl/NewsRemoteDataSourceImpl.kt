package com.newsappmaster.data.repository.dataSourceImpl

import com.newsappmaster.data.api.NewsAPIService
import com.newsappmaster.data.model.APIResponse
import com.newsappmaster.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

/**
Implementation of suspend functions from Interface
 */
class NewsRemoteDataSourceImpl (
    private val newsAPIService: NewsAPIService
): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country : String, page : Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country,page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getSearchedTopHeadlines(country,searchQuery,page)
    }
}
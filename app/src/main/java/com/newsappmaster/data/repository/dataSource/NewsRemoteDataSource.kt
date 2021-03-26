package com.newsappmaster.data.repository.dataSource

import com.newsappmaster.data.model.APIResponse
import retrofit2.Response

/**
    Used Couroutines suspend functions to  get Headlines and News without blocking main thread.
 */
interface NewsRemoteDataSource {
    suspend fun getTopHeadlines(country : String, page : Int): Response<APIResponse>
    suspend fun getSearchedNews(country : String,searchQuery:String, page : Int): Response<APIResponse>
}
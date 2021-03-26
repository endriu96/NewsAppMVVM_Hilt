package com.newsappmaster.data.api

import com.newsappmaster.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Getting data from API
 *
 */
interface NewsAPIService {
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = "b7122b5c5f8948eda9715867b6240ce6"
    ): Response<APIResponse>

    @GET("v2/top-headlines")
    suspend fun getSearchedTopHeadlines(
        @Query("country")
        country:String,
        @Query("q")
        searchQuery:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String = "b7122b5c5f8948eda9715867b6240ce6"
    ): Response<APIResponse>
}
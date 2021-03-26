package com.newsappmaster.domain.repository

import com.newsappmaster.data.model.APIResponse
import com.newsappmaster.data.model.Article
import com.newsappmaster.data.util.Resource
import kotlinx.coroutines.flow.Flow

/**
 * UseCases need a reference to repository which are implemented here
 *
 *
 */
interface NewsRepository {

    suspend fun getNewsHeadlines(country : String, page : Int): Resource<APIResponse>
    suspend fun getSearchedNews(country: String,searchQuery:String,page: Int) : Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    //As its data stream we dont need to write as suspending function
    fun getSavedNews(): Flow<List<Article>>
}
package com.newsappmaster.data.repository


import com.newsappmaster.data.model.APIResponse
import com.newsappmaster.data.model.Article
import com.newsappmaster.data.repository.dataSource.NewsRemoteDataSource
import com.newsappmaster.data.util.Resource
import com.newsappmaster.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

/**
 *Implementation of suspend functions which get News and return it. Repository handle data operations providing clean API.
 *
 */
class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource
): NewsRepository {
    override suspend fun getNewsHeadlines(country : String, page : Int): Resource<APIResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines(country,page))
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Resource<APIResponse> {
        return responseToResource(
            newsRemoteDataSource.getSearchedNews(country,searchQuery,page)
        )
    }

    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse> {
        if(response.isSuccessful){
            response.body()?.let {result->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }


    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}
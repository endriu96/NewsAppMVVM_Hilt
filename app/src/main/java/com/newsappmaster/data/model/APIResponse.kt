package com.newsappmaster.data.model

import com.google.gson.annotations.SerializedName


/**
 * Model for received data from API. Converted from ,,JSON to Kotlin Class" IDE plugin.
 *
 */
class APIResponse (
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)
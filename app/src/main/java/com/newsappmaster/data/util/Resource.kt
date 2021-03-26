package com.newsappmaster.data.util

/**
 *
 *Usually API response has 3 states. Loading, success and error. Google provides utility class for these states.
 * Copied from https://developer.android.com/jetpack/guide
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
}
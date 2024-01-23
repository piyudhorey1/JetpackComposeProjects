package com.example.movietowatch.data.remote

import com.example.movietowatch.utils.Dispatcher
import kotlinx.coroutines.withContext

internal class RemoteDataSource(
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {

    suspend fun getPopularMovies(page: Int) = withContext(dispatcher.io){
        apiService.getPopularMovies(page)
    }

    suspend fun getSingleMovie(movieId: Int) = withContext(dispatcher.io){
        apiService.getSingleMovie(movieId)
    }
}
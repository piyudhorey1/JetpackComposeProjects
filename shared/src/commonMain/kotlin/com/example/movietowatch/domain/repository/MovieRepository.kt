package com.example.movietowatch.domain.repository

import com.example.movietowatch.domain.model.Movie

internal interface MovieRepository {

    suspend fun getPopularMovies(page: Int): List<Movie>

    suspend fun getSingleMovie(movieId: Int): Movie
}
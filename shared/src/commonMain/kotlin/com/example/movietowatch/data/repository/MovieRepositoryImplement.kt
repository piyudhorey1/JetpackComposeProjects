package com.example.movietowatch.data.repository

import com.example.movietowatch.data.remote.RemoteDataSource
import com.example.movietowatch.data.util.toMovie
import com.example.movietowatch.domain.model.Movie
import com.example.movietowatch.domain.repository.MovieRepository

internal class MovieRepositoryImplement(
    private val remoteDataSource: RemoteDataSource
): MovieRepository
     {
    override suspend fun getPopularMovies(page: Int): List<Movie> {
        return remoteDataSource.getPopularMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getSingleMovie(movieId: Int): Movie {
        return remoteDataSource.getSingleMovie(movieId = movieId).toMovie()
    }

}
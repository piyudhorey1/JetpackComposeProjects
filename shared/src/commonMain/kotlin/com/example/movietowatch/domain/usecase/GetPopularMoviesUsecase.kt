package com.example.movietowatch.domain.usecase

import com.example.movietowatch.domain.model.Movie
import com.example.movietowatch.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetPopularMoviesUsecase: KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(page: Int): List<Movie>{
        return repository.getPopularMovies(page = page)
    }
}
package com.example.movietowatch.di

import com.example.movietowatch.data.remote.MovieService
import com.example.movietowatch.data.remote.RemoteDataSource
import com.example.movietowatch.data.repository.MovieRepositoryImplement
import com.example.movietowatch.domain.repository.MovieRepository
import com.example.movietowatch.domain.usecase.GetPopularMoviesUsecase
import com.example.movietowatch.domain.usecase.GetSingleMovieUseCase
import com.example.movietowatch.utils.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImplement(get()) }
    factory { GetPopularMoviesUsecase() }
    factory { GetSingleMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModule() = sharedModules
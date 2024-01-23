package com.example.movietowatch.data.remote

import kotlinx.serialization.Serializable

@Serializable
internal data class MovieResponse(
    val results: List<MovieRemote>
)

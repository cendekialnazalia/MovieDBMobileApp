package com.cendekia.movieapp.core.utils

import com.cendekia.movieapp.core.data.source.local.entity.MovieEntity
import com.cendekia.movieapp.core.data.source.remote.response.MovieResponse
import com.cendekia.movieapp.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                movieId = it.id,
                title = it.title,
                overview = it.overview,
                poster_path = it.poster_path,
                release_data = it.release_date,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                title = it.title,
                overview = it.overview,
                poster_path = it.poster_path,
                release_data = it.release_data,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        title = input.title,
        overview = input.overview,
        poster_path = input.poster_path,
        release_data = input.release_data,
        isFavorite = input.isFavorite
    )
}
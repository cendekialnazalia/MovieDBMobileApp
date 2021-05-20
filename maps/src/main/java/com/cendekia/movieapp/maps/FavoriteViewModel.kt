package com.cendekia.movieapp.maps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.cendekia.movieapp.core.domain.usecase.MovieUseCase

class FavoriteViewModel(movieUseCase: MovieUseCase) : ViewModel() {
    val favoriteMovie = movieUseCase.getFavoriteMovie().asLiveData()
}


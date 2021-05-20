package com.cendekia.movieapp.di

import com.cendekia.movieapp.core.domain.usecase.MovieInteractor
import com.cendekia.movieapp.core.domain.usecase.MovieUseCase
import com.cendekia.movieapp.detail.DetailMovieViewModel
import com.cendekia.movieapp.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}
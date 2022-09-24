package com.affan.movieapp.main.movies.presenter

import com.affan.movieapp.model.movie.Movie
import com.affan.movieapp.main.movies.MoviesData

interface MoviesView {
    fun onReceiveMovies(movies: List<MoviesData>)
    fun onSuccessGetPopularMovies(movies: List<Movie?>)
    fun onFailGetPopularMovies(string: String)
}
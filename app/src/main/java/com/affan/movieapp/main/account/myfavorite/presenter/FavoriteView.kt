package com.affan.movieapp.main.account.myfavorite.presenter

import com.affan.movieapp.data.local.room.FavoriteMovies

@Deprecated("Not Used Anymore")
interface FavoriteView {
    fun onGetDataFavoriteSuccess(data : List<FavoriteMovies>)
    fun onGetDataFavoriteFailure(message : String)
}
package com.example.moviemvp.view.home

import com.example.moviemvp.models.pojo.Movie

class HomeContract {

    interface View{
        fun successGetData(list: MutableList<Movie>?)
        fun failedGetData(message: String)
    }

    interface Presenter{
        fun getData()
    }

}
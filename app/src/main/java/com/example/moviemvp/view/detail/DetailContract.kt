package com.example.moviemvp.view.detail

class DetailContract {

    interface View {
        fun onSuccessGetData()
        fun onFailedGetData()
    }

    interface Presenter {
        fun getData()
    }
}
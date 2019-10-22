package com.example.moviemvp.view.home

import com.example.moviemvp.api.Client
import com.example.moviemvp.api.Service
import com.example.moviemvp.models.parser.MovieParser
import com.example.moviemvp.models.pojo.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

class HomePresenter constructor(val view: HomeContract.View) : HomeContract.Presenter {

    override fun getData() {
        try {
            val client = Client()
            val apiService = client.getClient().create(Service::class.java)
            val call: Call<MovieParser> = apiService.getNowPlayingMovie("2c75a1df7a1409aa228adb5b125d11e4")
            call.enqueue(object: Callback<MovieParser>{

                override fun onResponse(call: Call<MovieParser>, response: Response<MovieParser>) {
                    val data = response.body()?.getmResult() as MutableList<Movie>
                    view.successGetData(data)
                }

                override fun onFailure(call: Call<MovieParser>, t: Throwable) {
                    view.failedGetData("test failur")
                }

            })
        } catch (e: Exception){

        }
    }

}
package com.example.moviemvp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

public class Client {
    val BASE_URL = "https://api.themoviedb.org/3/"

    fun getClient(): Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}
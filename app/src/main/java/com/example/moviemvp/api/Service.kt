package com.example.moviemvp.api

import com.example.moviemvp.models.parser.MovieParser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface Service {

    @GET("movie/now_playing")
    fun getNowPlayingMovie(
        @Query("api_key") apiKey: String): Call<MovieParser>
}
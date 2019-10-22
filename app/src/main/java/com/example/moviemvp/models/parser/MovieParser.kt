package com.example.moviemvp.models.parser

import com.example.moviemvp.models.pojo.Movie
import com.google.gson.annotations.SerializedName

public class MovieParser {

    @SerializedName("results")
    var mResult: List<Movie>? = null

    fun getmResult(): List<Movie>? {
        return mResult
    }

    fun setmResult(mResult: List<Movie>) {
        this.mResult = mResult
    }

}
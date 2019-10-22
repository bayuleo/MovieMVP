package com.example.moviemvp.models.pojo

import com.google.gson.annotations.SerializedName

data class Movie (

    @field:SerializedName("popularity")
    var popularity: Double = 0.0,

    @field:SerializedName("vote_count")
    var voteCount: Int = 0,

    @field:SerializedName("video")
    var video: String = "",

    @field:SerializedName("poster_path")
    var posterPath: String = "",

    @field:SerializedName("id")
    var id: Int = 0,

    @field:SerializedName("adult")
    var adult: Boolean = false,

    @field:SerializedName("backdrop_path")
    var backdropPath: String = "",

    @field:SerializedName("original_language")
    var originalLanguage: String = "",

    @field:SerializedName("original_title")
    var originalTitle: String = "",

    @field:SerializedName("title")
    var title: String = "",

    @field:SerializedName("vote_average")
    var voteAverage: Double = 0.0,

    @field:SerializedName("overview")
    var overview: String = "",

    @field:SerializedName("release_date")
    var releaseDate: String = ""

)
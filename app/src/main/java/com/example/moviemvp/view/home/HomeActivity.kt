package com.example.moviemvp.view.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviemvp.R
import com.example.moviemvp.adapter.HomeAdapter
import com.example.moviemvp.models.pojo.Movie
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), HomeContract.View {


    var movieList: MutableList<Movie> = mutableListOf()
    lateinit var movieAdapter: HomeAdapter
    lateinit var presenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rv_home.layoutManager = GridLayoutManager(this, 2)
        movieAdapter = HomeAdapter(this, movieList)
        rv_home.adapter = movieAdapter

        presenter = HomePresenter(this)

        presenter.getData()
    }

    override fun successGetData(list: MutableList<Movie>?) {
        movieAdapter.updateData(list)
        movieAdapter.notifyDataSetChanged()
    }

    override fun failedGetData(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}

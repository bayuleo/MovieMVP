package com.example.moviemvp.view.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviemvp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(), DetailContract.View {

    lateinit var presenter: DetailPresenter
    lateinit var title: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initIntentData()
        initLayout()
        initPresenter()
    }

    private fun initPresenter() {
        presenter = DetailPresenter()
    }

    private fun initIntentData() {

        title = intent.getStringExtra("title")

    }

    private fun initLayout() {

        lbl_title_detail.text = title

    }

    override fun onSuccessGetData() {

    }

    override fun onFailedGetData() {

    }

}

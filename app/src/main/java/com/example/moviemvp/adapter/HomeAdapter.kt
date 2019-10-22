package com.example.moviemvp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviemvp.R
import com.example.moviemvp.models.pojo.Movie
import com.example.moviemvp.view.detail.DetailActivity
import com.example.moviemvp.view.home.HomeActivity

class HomeAdapter(val mContext: Context, var movieList: MutableList<Movie>?) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(mContext).inflate(R.layout.item_home, parent, false)
        val holder = ViewHolder(view)
        return holder
    }

    override fun getItemCount(): Int {
        return movieList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = movieList!!.get(position)
        holder.title.text = data.title


        Glide.with(mContext)
            .load("https://image.tmdb.org/t/p/w300_and_h450_bestv2"+data.posterPath)
            .into(holder.poster)

        holder.layoutItem.setOnClickListener {
            val intent: Intent
            intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("title", data.title)
            mContext.startActivity(intent)
        }
    }

    fun updateData(list: MutableList<Movie>?){
        movieList!!.clear()
        this.movieList = list
    }

}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title: TextView = itemView.findViewById(R.id.lbl_title_movie)
    val poster: ImageView = itemView.findViewById(R.id.img_poster)
    val layoutItem: LinearLayout = itemView.findViewById(R.id.lay_item)

}

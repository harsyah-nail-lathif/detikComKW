package com.example.myapplication.NewsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.detikkom.R
import kotlinx.android.synthetic.main.list_themplate.view.*

class NewsAdapter (val context: Context, val listnews: List<news>):
        RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentNews:news? = null
        var currentpositon: Int = 0

        fun setData(currnt: news, post: Int){
            itemView.tvw_title.text = currnt!!.tittle
            itemView.tvw_desc.text = currnt!!.desc
            itemView.img_news.setImageResource(currnt!!.image)

            this.currentNews
            this.currentpositon
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_themplate, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
    return listnews.size
   }

    override fun onBindViewHolder(holder:NewsAdapter.MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener(){onItemclickCallback.onItemClick(listnews[position])}
    }

    private lateinit var onItemclickCallback: OnItemClickCallback

    fun setOnClickCallBack(onItemClickCallBack: OnItemClickCallback){
        this.onItemclickCallback = onItemClickCallBack
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }
}
package com.example.detikkom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.NewsAdapter.NewsAdapter
import com.example.myapplication.NewsAdapter.NewsModel
import com.example.myapplication.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlinenews: news?

        if (NewsModel.newslist.size>0){
            headlinenews = NewsModel.newslist[NewsModel.newslist.size - 1]
            tvw_TitleHeadLine.setText(headlinenews.tittle)
            tvw_DescHeadline.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.image)

            cdv_newsheadline.setOnClickListener {
                val intentDetail = Intent(this@MainActivity,Detailactivity::class.java).apply {
                    putExtra(Detailactivity.cont_titlenews,headlinenews.tittle)
                    putExtra(Detailactivity.cont_photonews,headlinenews.image.toString())
                }
                startActivity(intentDetail)
                finish()
            }

            val layotManager = LinearLayoutManager(this)
            layotManager.orientation = LinearLayoutManager.VERTICAL
            rcv_daftarberita.layoutManager = layotManager

            newsAdapter = NewsAdapter(this, NewsModel.newslist)
            rcv_daftarberita.adapter = newsAdapter

            newsAdapter.setOnClickCallBack(object : NewsAdapter.OnItemClickCallback{
                override fun onItemClick(data: news) {
                    val intentdata = Intent(this@MainActivity,Detailactivity::class.java).apply {
                        putExtra(Detailactivity.cont_titlenews, data.tittle.toString())
                        putExtra(Detailactivity.cont_photonews, data.image.toString())
                    }
                    startActivity(intentdata)
                    finish()
                }
            })
        }
    }

}
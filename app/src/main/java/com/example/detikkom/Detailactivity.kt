package com.example.detikkom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detailactivity.*

class Detailactivity : AppCompatActivity() {

    companion object{
        const val cont_titlenews = "cont_titlenews"
        const val cont_photonews = "cont_photonews"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailactivity)

        txt_TitleNews.setText(intent.getStringExtra(cont_titlenews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_photonews).toInt())

        btn_back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intentback = Intent(this@Detailactivity, MainActivity::class.java)
                startActivity(intentback)
                finish()
            }
        }) 
    }
}
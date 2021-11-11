package com.example.recyclerview_alifa_04

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNCTDreamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val nctdream = intent.getParcelableExtra<NCTDream>(MainActivity.INTENT_PARCELABLE)

        val imgnctdream = findViewById<ImageView>(R.id.img_item_photo)
        val namenctdream = findViewById<TextView>(R.id.tv_item_name)
        val descnctdream = findViewById<TextView>(R.id.tv_item_description)

        imgnctdream.setImageResource(nctdream?.imgNCTDream!!)
        namenctdream.text = nctdream.nameNCTDream
        descnctdream.text = nctdream.descNCTDream
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
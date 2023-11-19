package com.tutorial.superheroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailSuperHeroActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_ID = "extra_id"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_super_hero)

    }


}
package com.example.bloknot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTransliteAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein)
        val image2 = findViewById<ImageView>(R.id.imageView2)

        image2.startAnimation(mTransliteAnimation)



    }
}
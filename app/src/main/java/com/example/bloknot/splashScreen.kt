package com.example.bloknot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mTransliteAnimationOut = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        val mTransliteAnimationIn = AnimationUtils.loadAnimation(this, R.anim.fadein)


        val imageBloknot = findViewById<ImageView>(R.id.imageView)
        val textOleg = findViewById<TextView>(R.id.textView)

        val textZagolovok = findViewById<TextView>(R.id.textView2)
        val buttonNewZametka = findViewById<Button>(R.id.button)
        val buttonFullZametki = findViewById<Button>(R.id.button2)

        val handler = Handler().postDelayed({
            imageBloknot.startAnimation(mTransliteAnimationOut)
            textOleg.startAnimation(mTransliteAnimationOut)
        },2000)

        val handler2 = Handler().postDelayed({
            imageBloknot.visibility = View.INVISIBLE
            textOleg.visibility = View.INVISIBLE
        }, 3000)

        val handler3 = Handler().postDelayed({
            textZagolovok.startAnimation(mTransliteAnimationIn)
            buttonNewZametka.startAnimation(mTransliteAnimationIn)
            buttonFullZametki.startAnimation(mTransliteAnimationIn)
        },3000)

        val hadler4 = Handler().postDelayed({
            textZagolovok.visibility = View.VISIBLE
            buttonNewZametka.visibility = View.VISIBLE
            buttonFullZametki.visibility = View.VISIBLE

        }, 3000)







    }
}
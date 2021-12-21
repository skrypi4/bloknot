package com.example.bloknot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bloknot.fragments.FulLZametki
import com.example.bloknot.fragments.NewRecordFragment

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        Router.showNewRecordFragment()

        //Router.showFullZametkiFragment()
    }
}
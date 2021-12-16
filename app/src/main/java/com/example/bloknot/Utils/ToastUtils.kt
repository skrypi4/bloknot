package com.example.bloknot.Utils

import android.widget.Toast
import com.example.bloknot.base.MainApplication

object ToastUtils {

    fun toast(string: String){
        val context = MainApplication.applicationContext()
        Toast.makeText(context, string, Toast.LENGTH_LONG).show()
    }

    fun toast(resId: Int){
        val context = MainApplication.applicationContext()
        Toast.makeText(context, context.resources.getString(resId), Toast.LENGTH_LONG).show()
    }

}
package com.example.bloknot

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Adapter(string: ArrayList<String>):BaseAdapter() {
    var strings: ArrayList<String> = ArrayList<String>()

    init {
        this.strings = strings
    }




    override fun getCount(): Int {
        return  strings.size
    }

    override fun getItem(position: Int): String? {
        return strings?.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view: View?
        if (convertView == null) {
            view = LayoutInflater.from(parent?.context).inflate(R.layout.list_name, parent, false)
        } else {
            view = convertView
        }

        val text = view?.findViewById<TextView>(R.id.text1)
        text?.text = strings.get(position)


    return  view
    }



}
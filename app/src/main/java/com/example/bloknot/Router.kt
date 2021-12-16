package com.example.bloknot

import android.app.Fragment
import com.example.bloknot.base.MainApplication
import com.example.bloknot.fragments.NewRecordFragment

object Router {

    fun showNewRecordFragment(){
        setAnchorFragment(NewRecordFragment())
    }

    private fun setAnchorFragment(fragment: Fragment){
        val fm = MainApplication.instance?.activity?.fragmentManager
        val ft = fm?.beginTransaction()
        ft?.replace(R.id.container, fragment)
        ft?.commit()
    }

    private fun addFragment(fragment: Fragment){
        MainApplication.applicationContext()
    }

}
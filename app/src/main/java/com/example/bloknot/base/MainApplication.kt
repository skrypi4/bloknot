package com.example.bloknot.base

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle

class MainApplication : Application() {

    companion object {
        lateinit var instance: MainApplication

        fun applicationContext() : Context {
            return instance.applicationContext
        }
    }

    var activity: Activity? = null
        private set

    override fun onCreate() {
        super.onCreate()
        instance = this
        instance.registerActivityLifecycleCallbacks(object: ActivityLifecycleCallbacks{
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                this@MainApplication.activity = activity
            }

            override fun onActivityStarted(activity: Activity) {
                this@MainApplication.activity = activity
            }

            override fun onActivityResumed(activity: Activity) {
                this@MainApplication.activity = activity
            }

            override fun onActivityPaused(activity: Activity) {
                this@MainApplication.activity = null
            }

            override fun onActivityStopped(activity: Activity) {

            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

            }

            override fun onActivityDestroyed(activity: Activity) {
                this@MainApplication.activity = null
            }
        })
    }
}
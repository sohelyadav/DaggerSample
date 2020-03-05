package com.sohel.daggersample.ui

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    companion object{
       private val TAG : String= "car"
    }

    fun drive(){
        Log.d(TAG, "driving....")
    }

}
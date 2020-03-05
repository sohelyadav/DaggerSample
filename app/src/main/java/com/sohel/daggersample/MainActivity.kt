package com.sohel.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sohel.daggersample.di.CarComponent
import com.sohel.daggersample.di.DaggerCarComponent
import com.sohel.daggersample.ui.Car

class MainActivity : AppCompatActivity() {

    private lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent: CarComponent = DaggerCarComponent.create()
        car= carComponent.getCar()
        car.drive()
    }

}

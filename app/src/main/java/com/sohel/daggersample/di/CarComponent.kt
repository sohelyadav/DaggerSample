package com.sohel.daggersample.di

import com.sohel.daggersample.ui.Car
import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car
}
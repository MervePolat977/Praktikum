package com.mervepolat.praktikum_first

class IncreasingSensor(private var currentTemp: Double) : Sensor {
    override fun getTemperature(): Double {
        val temp = currentTemp
        currentTemp += 0.5
        return temp
    }
}

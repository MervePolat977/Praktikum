package com.mervepolat.praktikum_first

import kotlin.math.sin

class SinusoidalSensor(
    private val amplitude: Double,
    private val frequency: Double,
    private val phaseShift: Double
) : Sensor {
    override fun getTemperature(): Double {
        val time = System.currentTimeMillis() / 1000.0 // Get current time in seconds
        return amplitude * sin(2 * Math.PI * frequency * time + phaseShift)
    }
}

package com.mervepolat.praktikum_first

// Main.kt

fun main() {
    val randomSensor = RandomSensor(min = 2.0, max = 8.0)
    println("Random Sensor")
    repeat(4) {
        println(randomSensor.getTemperature())
    }

    val constantSensor = ConstantSensor(temp = 21.5)
    println("Constant Sensor")
    repeat(4) {
        println(constantSensor.getTemperature())
    }

    val increasingSensor = IncreasingSensor(currentTemp = 15.0)
    println("Increasing Sensor")
    repeat(4) {
        println(increasingSensor.getTemperature())
    }
}

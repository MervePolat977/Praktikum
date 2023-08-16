package com.mervepolat.praktikum_first

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers.Main

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Start the thermometer simulation functionality from Main.kt
        // You can replace Main::class.java with the actual path to the Main.kt file if it's in a different package
        startActivity(Intent(this, Main::class.java))

        // Finish the MainActivity (optional, depending on your app flow)
        finish()
    }
}

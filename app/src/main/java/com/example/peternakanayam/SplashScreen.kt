package com.example.peternakanayam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_splash)

        // Menunggu 3 detik sebelum beralih ke MainActivity
        lifecycleScope.launch {
            delay(3000)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish() // Mengakhiri SplashScreen Activity
        }
    }
}

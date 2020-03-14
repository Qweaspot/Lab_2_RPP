package com.example.lab_2_rpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val mainActivity = Intent (this, MainActivity::class.java)
        val handler = android.os.Handler()

        handler.postDelayed({}, 2000)
        android.os.Handler().postDelayed({
            startActivity(mainActivity)
        }, 2000)

    }
}

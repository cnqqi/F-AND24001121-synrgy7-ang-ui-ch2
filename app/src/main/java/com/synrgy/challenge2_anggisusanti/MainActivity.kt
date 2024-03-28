package com.synrgy.challenge2_anggisusanti

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Check if the device is running on Lollipop or higher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            // Set the status bar color to the colorPrimaryDark color
            window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        }

        // Other initialization code for your activity
    }
}

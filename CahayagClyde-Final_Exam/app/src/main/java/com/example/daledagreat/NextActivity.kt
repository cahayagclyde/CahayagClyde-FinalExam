package com.example.daledagreat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton;

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_next)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener {
            navigateToVeigoActivity()
        }
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)
        imageButton3.setOnClickListener {
            navigateToThreshActivity()
        }
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        imageButton2.setOnClickListener {
            navigateToPuerto()
        }


    }

    private fun navigateToVeigoActivity() {
        val intent = Intent(this, VeigoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToThreshActivity() {
        val intent = Intent(this, ThreshActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToPuerto() {
        val intent = Intent(this, Puerto::class.java)
        startActivity(intent)
    }
}
package com.example.togglebuttonexample

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var imagen: ImageView
    lateinit var toggle: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        imagen.findViewById<ImageView>(R.id.imagen)
        toggle.findViewById<ToggleButton>(R.id.toggle)

        toggle.setOnCheckedChangeListener { buttonView, isChecked ->
            imagen.isVisible = isChecked
        }
    }
}
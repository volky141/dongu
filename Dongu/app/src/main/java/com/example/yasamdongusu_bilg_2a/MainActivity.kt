package com.example.yasamdongusu_bilg_2a

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    println("OnCreate Çağrıldı")
    }
    override fun onStart() {
        super.onStart()
        println("onStart çağrıldı")
    }
    override fun onResume() {
        super.onResume()
        println("onResume çağrıldı")
    }
    override fun onPause() {
        super.onPause()
        println("onPause çağrıldı")
    }
    override fun onStop() {
        super.onStop()
        println("onStop çağrıldı")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağrıldı")
    }


    fun aktivite2(view: View)
    {
        val intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)
    }


}
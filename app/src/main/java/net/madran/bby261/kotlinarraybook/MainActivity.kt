package net.madran.bby261.kotlinarraybook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val metinler = arrayOf("Sayfa 1", "Sayfa 2", "Sayfa 3")
    
}
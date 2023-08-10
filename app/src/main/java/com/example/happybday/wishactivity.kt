package com.example.happybday

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.happybday.R.id.button

class wishactivity:AppCompatActivity() {
    private var a = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wish)


           val btn = findViewById<Button>(button)
           btn.setOnClickListener { changecake() }

    }

    private fun changecake()
    {

        var img=findViewById<ImageView>(R.id.imageView2)
        val intent1= Intent(this,Birthday::class.java)
        when (a) {
            1 -> img.setImageResource(R.drawable.cake1)
            2 -> img.setImageResource(R.drawable.cake2)
            3 -> img.setImageResource(R.drawable.cake3)
            4 -> img.setImageResource(R.drawable.cake4)
            5 -> img.setImageResource(R.drawable.cake5)
            6 -> img.setImageResource(R.drawable.cake6)
            7->img.setImageResource(R.drawable.cake7)
            8->startActivity(intent1)

        }
        if(a!=8) {
            a++
        }


    }
}
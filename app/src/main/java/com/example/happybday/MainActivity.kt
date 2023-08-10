package com.example.happybday

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {
    private lateinit var myCardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button2)


        val fadeInAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val textView = findViewById<TextView>(R.id.textView2)
        textView.startAnimation(fadeInAnimation)

        myCardView = findViewById(R.id.myCardView)
        myCardView.setOnClickListener {
            // Perform the desired action when the CardView is clicked
            // For example, you can launch a new activity or show a toast message
            Toast.makeText(this, "Have a great year ahead", Toast.LENGTH_SHORT).show()


            button1.setOnClickListener {

                val options: ActivityOptions = ActivityOptions.makeCustomAnimation(
                    this,
                    R.anim.fade_in,
                    R.anim.fade_out
                    //R.anim.flip_in,
                    //R.anim.flip_out
                )

                val intent = Intent(this, wishactivity::class.java)

//            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//                this,
//                Pair.create<View, String>(button1, "buttonTransition"),
//                Pair.create<View, String>(textView, "textTransition")
//            )


                startActivity(intent, options.toBundle())

                //overridePendingTransition(R.anim.flip_in, R.anim.flip_out)


            }
        }
    }
}
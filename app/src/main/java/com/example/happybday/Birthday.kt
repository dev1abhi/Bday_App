package com.example.happybday

import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Birthday:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.birthday)

        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.my_video)
        videoView.start()

    }

}
package com.app1.audiosandroid

import android.graphics.Color.GREEN
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun playMusic(button :View){
        var button = button as Button
        var originalBackground = button.background
        val mediaPlayer = MediaPlayer.create(this, resources.getIdentifier(button.tag as String, "raw", packageName))
        mediaPlayer.start()

        if(mediaPlayer.isPlaying){
            button.setBackgroundColor(GREEN)
        }

        stop_btn.setOnClickListener{
            mediaPlayer.reset()
            button.background = originalBackground
        }
    }


}

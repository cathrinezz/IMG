package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnTouchListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img.setOnTouchListener(this)
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.pokemon)
        } else if (event?.action == MotionEvent.ACTION_UP) {
            img.setImageResource(R.drawable.ohtilly)
        } else if (event?.action == MotionEvent.ACTION_MOVE) {
            img.setImageResource(R.drawable.three)

        }
        return true
    }
}

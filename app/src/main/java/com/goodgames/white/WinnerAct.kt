package com.goodgames.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodgames.R
import kotlinx.android.synthetic.main.activity_winner.*

class WinnerAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner)

        btnplay.setOnClickListener{
            startActivity(Intent(this, Game::class.java))
        }
    }
}
package com.example.zuev_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var text: String = "В магазине <осталось> 10 банок колы, а может и больше"
    private var txText: TextView? = null;

    override fun onCreate(SavedInstanceState: Bundle?) {
            super.onCreate(SavedInstanceState)
            setContentView(R.Layout.activity_main)
            tvText = findViewById(R.Id.txTextView)
            var subText: String = text.substringAfter('<')
            var subText2: String = subText.substringBefore('>')

            txText?.setText(subText)
        }
    }
}
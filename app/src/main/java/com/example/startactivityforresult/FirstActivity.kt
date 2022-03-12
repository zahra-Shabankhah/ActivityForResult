package com.example.startactivityforresult

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        btnFirst.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}
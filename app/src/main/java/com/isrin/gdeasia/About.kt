package com.isrin.gdeasia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        cvProfile.setImageResource(R.drawable.profile)

        iconBackAbout.setOnClickListener {
            finish()
        }
    }
}

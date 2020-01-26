package com.isrin.gdeasia

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.item_card_gde.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        iconBack.setOnClickListener {
            finish()
        }

        val intent = intent

        ivFoto.setImageResource(intent.getIntExtra("photo", 0))
        tvNames.text = intent.getStringExtra("name")
        tvDecs.text = intent.getStringExtra("desc")
    }
}

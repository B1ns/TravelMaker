package com.example.travelmaker.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.activity_sea.*

class SeaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sea)

        fab.setOnClickListener {
            finish()
        }

        po.setOnClickListener {
            startActivity(Intent(this@SeaActivity, PoActivity::class.java))
        }
    }
}

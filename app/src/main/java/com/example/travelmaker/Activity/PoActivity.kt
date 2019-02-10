package com.example.travelmaker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.activity_sea.*
import kotlinx.android.synthetic.main.fragment_po.*
import kotlinx.android.synthetic.main.fragment_po.view.*

class PoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_po)
        fab.setOnClickListener {
            finish()
        }
        checkBox.setOnClickListener {
            text.text = "1"
        }
    }
}

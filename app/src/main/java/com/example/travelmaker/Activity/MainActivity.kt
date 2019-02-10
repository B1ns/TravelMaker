package com.example.travelmaker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.travelmaker.Fragment.HomeFragment
import com.example.travelmaker.Fragment.MypageFragment
import com.example.travelmaker.Fragment.SearchFragment
import com.example.travelmaker.Fragment.SettingFragment
import com.example.travelmaker.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private val FINSH_INTERVAL_TIME = 2000
    private var backPressedTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.selectedItemId = R.id.action_1


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, HomeFragment.newInstance())
                    .commit()
                return true
            }
            R.id.action_2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, SearchFragment.newInstance())
                    .commit()
                return true
            }
            R.id.action_3 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, MypageFragment.newInstance())
                    .commit()
                return true
            }
            R.id.action_4 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, SettingFragment.newInstance())
                    .commit()
                return true
            }

        }
        return false
    }

    override fun onBackPressed() {
        val tempTime = System.currentTimeMillis()
        val intervalTime = tempTime - backPressedTime
        if (intervalTime in 0..FINSH_INTERVAL_TIME) {
            ActivityCompat.finishAffinity(this)
        } else {
            backPressedTime = tempTime
            Toast.makeText(applicationContext, "한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show()
        }
    }

}

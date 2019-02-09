package com.example.travelmaker.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.travelmaker.Fragment.HomeFragment
import com.example.travelmaker.Fragment.MypageFragment
import com.example.travelmaker.Fragment.SearchFragment
import com.example.travelmaker.Fragment.SettingFragment
import com.example.travelmaker.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.action_1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, HomeFragment.newInstance()).commit()
                return true
            }
            R.id.action_2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, MypageFragment.newInstance()).commit()
                return true
            }
            R.id.action_3 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, SearchFragment.newInstance()).commit()
                return true
            }
            R.id.action_4 -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, SettingFragment.newInstance()).commit()
                return true
            }

        }
        return false
    }



}

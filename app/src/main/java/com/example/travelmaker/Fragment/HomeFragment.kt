package com.example.travelmaker.Fragment


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelmaker.Activity.SeaActivity
import com.example.travelmaker.Adapter.recyclerAdapter
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.fragment_home.view.*




class HomeFragment : androidx.fragment.app.Fragment() {


    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.summer.setOnClickListener {
            startActivity(Intent(context, SeaActivity::class.java))
        }

        // Inflate the layout for this fragment
        val recyclerview_main: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerview_main.layoutManager = LinearLayoutManager(activity, LinearLayout.HORIZONTAL, false)
        recyclerview_main.adapter = recyclerAdapter()

        return view

    }

}

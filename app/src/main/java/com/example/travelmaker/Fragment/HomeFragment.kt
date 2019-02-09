package com.example.travelmaker.Fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*




class HomeFragment : androidx.fragment.app.Fragment() {



    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()
        summer.setOnClickListener {
            fragmentTransaction.replace(android.R.id.content, SeaFragment.newInstance())
            fragmentTransaction.commit()
        }

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        val adapter = ImageAdapter()
        view.view_pager.adapter = adapter


        return view

    }

}

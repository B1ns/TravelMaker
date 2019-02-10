package com.example.travelmaker.Fragment


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_sea.*
import kotlinx.android.synthetic.main.fragment_sea.view.*


class SeaFragment : androidx.fragment.app.Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = SeaFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragmentManager = fragmentManager
        val fragmentTransaction = fragmentManager!!.beginTransaction()


        val view = inflater.inflate(R.layout.fragment_sea, container, false)
        view.po.setOnClickListener {
            fragmentTransaction.replace(android.R.id.content, PoFragment.newInstance())
            fragmentTransaction.commit()
        }
        return view
    }


}

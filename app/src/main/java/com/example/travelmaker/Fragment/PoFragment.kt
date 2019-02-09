package com.example.travelmaker.Fragment


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelmaker.R
import kotlinx.android.synthetic.main.fragment_po.*
import kotlinx.android.synthetic.main.fragment_po.view.*


class PoFragment : androidx.fragment.app.Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = PoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_po, container, false)
        checkBox.setOnClickListener {
            text.text = "1"
        }
        // Inflate the layout for this fragment
        return view
    }


}

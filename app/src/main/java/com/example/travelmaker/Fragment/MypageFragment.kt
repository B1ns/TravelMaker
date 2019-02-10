package com.example.travelmaker.Fragment


import android.os.Bundle
import android.app.Fragment
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelmaker.R
import com.example.travelmaker.testActivity
import kotlinx.android.synthetic.main.fragment_mypage.view.*


class MypageFragment : androidx.fragment.app.Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = MypageFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mypage, container, false)
        view.button.setOnClickListener {
            startActivity(Intent(context, testActivity::class.java))
        }

        return view
    }


}

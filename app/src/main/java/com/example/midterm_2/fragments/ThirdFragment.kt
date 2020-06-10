package com.example.midterm_2.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.midterm_2.R
import kotlinx.android.synthetic.main.third_fragment.view.*

class ThirdFragment : Fragment(R.layout.third_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //view.textView2.text = third_fragmentArgs.fromBundle(requireArguments()).amount.toString()

    }

}
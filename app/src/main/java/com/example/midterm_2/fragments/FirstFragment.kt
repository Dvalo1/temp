package com.example.midterm_2.fragments

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.midterm_2.App
import com.example.midterm_2.Health
import com.example.midterm_2.R
import kotlinx.android.synthetic.main.first_fragment.*
import kotlinx.android.synthetic.main.first_fragment.view.*


class FirstFragment : Fragment(R.layout.first_fragment) {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        var healthEntryId = 0
        view.submit_btn.setOnClickListener {

            var stepsAmt = steps_amt.text.toString().toInt()
            var calBurnt = calories_amt.text.toString().toInt()
            var avgBpm = bpm_amt.text.toString().toInt()
            var wotahDrank = water_amt.text.toString().toInt()
            var hoursSlept = hours_amt.text.toString().toInt()
            var healthEntryId = healthEntryId + 1



            //val action = FirstFragmentDirections.actionNavigationFirstToNavigationThird("Test")

            //navController.navigate(action)
        }


    }

}
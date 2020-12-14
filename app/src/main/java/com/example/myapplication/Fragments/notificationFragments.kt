package com.example.myapplication.Fragments

import android.app.Notification
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_notification.*

class notificationFragments: Fragment(R.layout.fragment_notification) {
    private lateinit var textView: View



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView=view.findViewById(R.id.textView2)
        textView.text=NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString


    }

}
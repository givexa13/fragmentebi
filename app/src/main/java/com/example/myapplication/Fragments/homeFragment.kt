package com.example.myapplication.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R

class homeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var navController: NavController
    private lateinit var editText: EditText
    private lateinit var button: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)

        editText=view.findViewById(R.id.editTextNumber2)
        button=view.findViewById(R.id.button)
        button.setOnClickListener{

            val amount=editText.toString().toInt()
            val action=HomeFragmentDirections.actionNavigationHomeToNavigationNotification(amount)
            navController.navigate(action)


        }
    }


}
package com.azamat.runnerapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.azamat.runnerapp.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())

        navHostFragment.findNavController()
            .addOnDestinationChangedListener{_, destination, _ ->
                when(destination.id){
                    R.id.settingsFragment, R.id.statisticsFragment, R.id.runFragment ->
                        bottomNavigationView.visibility = View.VISIBLE
                    else -> bottomNavigationView.visibility = View.GONE

                }
            }
    }
}
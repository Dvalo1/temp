package com.example.midterm_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)

        val appBarConfig = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notification
        ))

        App.instance.db.getCarDao().deleteAll()

        var car1 = Health(0, 50, 100, 90, 2, 6)
        var car2 = Health(1, 100, 200, 91, 3, 9)

        App.instance.db.getCarDao().insert(car1, car2)

        App.instance.db.getCarDao().getAllCars().forEach { car ->
            Log.d("Mydata", car.toString())
        }

        setupActionBarWithNavController(navController, appBarConfig)
        navView.setupWithNavController(navController)

    }

}

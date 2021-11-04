package com.example.findpets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navigation_view : NavigationView
    lateinit var drawer_layout : DrawerLayout
    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        var drawer_layout = findViewById<DrawerLayout>(R.id.drawer_layout)
        var navigation_view = findViewById<NavigationView>(R.id.navigation_view)


        navController = findNavController(R.id.hostFragment)
        bottomNavigation.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(navController.graph, drawer_layout)

        NavigationUI.setupActionBarWithNavController(this, navController, drawer_layout)

        NavigationUI.setupWithNavController(navigation_view, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}
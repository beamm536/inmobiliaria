 package com.appclass.myapplication

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.appclass.myapplication.navigation.NavigationWrapper
import com.appclass.myapplication.ui.login.ui.LoginScreen
import com.appclass.myapplication.ui.login.ui.LoginViewModel

 class MainActivity : ComponentActivity() {

     private lateinit var navHostController: NavHostController

     @SuppressLint("ViewModelConstructorInComposable")// anotacion para q no me de error mas abajo :)
     @RequiresApi(Build.VERSION_CODES.O)
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         enableEdgeToEdge()
         setContent {
             navHostController = rememberNavController()
             NavigationWrapper(navHostController)

             LoginScreen(LoginViewModel())
         }
     }
 }


 package com.appclass.myapplication

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.appclass.myapplication.ui.login.ui.LoginScreen
import com.appclass.myapplication.ui.login.ui.LoginViewModel
import com.appclass.myapplication.ui.theme.MyApplicationTheme

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


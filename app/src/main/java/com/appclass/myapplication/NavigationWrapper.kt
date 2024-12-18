package com.appclass.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



@Composable
fun NavigationWrapper(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = "pantallaFormulario") {
        //composable("pantallaFormulario") { PantallaFormulario(navHostController) }
    }
}




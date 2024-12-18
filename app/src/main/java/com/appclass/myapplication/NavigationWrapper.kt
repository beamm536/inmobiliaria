package com.appclass.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appclass.myapplication.screens.PantallaFormulario1


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationWrapper(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = "pantallaFormulario1") {
        composable("pantallaFormulario1") { PantallaFormulario1(navHostController) }
    }
}




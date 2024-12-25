package com.appclass.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appclass.myapplication.screens.Pantalla2
import com.appclass.myapplication.screens.PantallaFormulario1
import com.appclass.myapplication.screens.ScreenForm1
import com.appclass.myapplication.screens.ScreenForm2
import androidx.navigation.compose.rememberNavController


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationWrapper(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = "screenForm1") {
        composable("pantallaFormulario1") { PantallaFormulario1(navHostController) }
        composable("pantalla2") { Pantalla2(navHostController) }
        composable("screenForm1") { ScreenForm1(navHostController) }
        composable("screenForm2") { ScreenForm2(navHostController) }
    }
}




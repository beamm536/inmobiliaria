package com.appclass.myapplication.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.appclass.myapplication.screens.Pantalla2
import com.appclass.myapplication.screens.PantallaFormulario1
import com.appclass.myapplication.screens.ScreenForm1
import com.appclass.myapplication.screens.ScreenForm2
import com.appclass.myapplication.ui.login.ui.LoginScreen


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavigationWrapper(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = AppScreens.ScreenForm1.ruta) {
        //para lincarlo con la sealed class --> cambiamos startDestination

//        composable("pantallaFormulario1") { PantallaFormulario1(navHostController) }
//        composable("pantalla2") { Pantalla2(navHostController) }
//        composable("screenForm1") { ScreenForm1(navHostController) }
//        composable("screenForm2") { ScreenForm2(navHostController) }
//        composable("loginScreen"){ LoginScreen(viewModel()) }
    }
}




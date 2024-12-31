package com.appclass.myapplication.navigation

sealed class AppScreens(val ruta: String){
    //en la sealed class --> vamos a contener los objetos (las vistas para establecer la navegacion) de cada ruta
    object LoginScreen: AppScreens("loginScreen")
    object ScreenForm1: AppScreens("screenForm1")
    object ScreenForm2: AppScreens("screenForm2")
}
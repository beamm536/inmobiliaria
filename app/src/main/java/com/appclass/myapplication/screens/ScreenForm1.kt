package com.appclass.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.appclass.myapplication.ui.theme.GrisOutlined

@Composable
fun ScreenForm1(navController: NavController){
    var isDarkTheme by remember{ mutableStateOf(false) } //estado del tema

    FunctionsCall(
        navController = navController,
        isDarkTheme = isDarkTheme,
        onThemeChange = { isDarkTheme = it },
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}

@Composable
fun ThemeSelector(isDarkTheme: Boolean, onThemeChange: (Boolean) -> Unit, modifier: Modifier = Modifier){

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ){
        Text(
            text = if(isDarkTheme){
                "Tema Oscuro"
            }else{
                "Tema Claro"
            }
        )
        Switch(
            checked = isDarkTheme,
            onCheckedChange = onThemeChange,
            thumbContent = {
                if (isDarkTheme){
                    Icon(
                        imageVector = Icons.Filled.Favorite, //aqui tendria q poner el icono de la luna en el switch, pero me da error
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                    )
                }else{

                    Icon(
                        imageVector = Icons.Filled.FavoriteBorder, //aqui tendria q poner el icono de la luna en el switch, pero me da error
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                    )

                }
            }
        )
    }



}

@Composable
fun FormFields(navController: NavController,modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 10.dp)
    ) {
        Spacer(modifier = Modifier.size(130.dp))
        Text(
            text = "Datos de reserva",
            style = MaterialTheme.typography.titleLarge,
            fontSize = 32.sp,
            //color = Color(0xFF202c41),
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(bottom = 63.dp),
            //fontFamily = FuenteGoogle()
        )

        Text(
            text = "1. Nombre Completo",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            //fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start),
            //fontFamily = FuenteGoogle()
        )

        // Variables del formulario para la base de datos
        var nombre by remember { mutableStateOf("") }
        var apellidos by remember { mutableStateOf("") }
        var dni by remember { mutableStateOf("") }
        var telefono by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }


        // Campos de entrada
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            singleLine = true,
            label = { Text("Nombre") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.onSurface,
                focusedLabelColor = MaterialTheme.colorScheme.primary,
                unfocusedLabelColor = MaterialTheme.colorScheme.onSurface,
                cursorColor = MaterialTheme.colorScheme.primary
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("Apellidos") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            )
        )



        Spacer(modifier = Modifier.size(32.dp))

        Text(
            text = "2. Datos de Contacto",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            //fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = telefono,
            onValueChange = { telefono = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("Tlfno") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Phone Icon",
                    tint = GrisOutlined //aqui para el cambio de color
                )
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    tint = GrisOutlined //aqui para el cambio de color
                )
            }
        )

        Spacer(modifier = Modifier.size(32.dp))

        Button(
            onClick = {
                navController.navigate("screenForm2")
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5)),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .height(50.dp)
        ) {
            Text("Siguiente", color = Color.White, fontSize = 18.sp)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                Icons.Default.ArrowForward,
                contentDescription = "Siguiente",
                tint = Color.White
            )
        }
    }
}

@Composable
fun FunctionsCall(
        navController: NavController,
        isDarkTheme: Boolean,
        onThemeChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier
){
    //todo tiene q estar dentro del componente MaterialTheme para q se cambie de manera global
    MaterialTheme(
        colorScheme =
            if (isDarkTheme){
                darkColorScheme()
            }else{
                lightColorScheme()
            }
    ){
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background) // Color de fondo
                .padding(16.dp)
        ){
            ThemeSelector(isDarkTheme = isDarkTheme, onThemeChange = onThemeChange)
            Spacer(modifier = Modifier.height(16.dp))
            FormFields(navController)
        }
    }
    //FormFields(navController,modifier = modifier)
}


//colores q van a cambiar dentro de la vista
@Composable
fun darkColorScheme() = darkColorScheme(
    primary = Color(0xFFBB86FC),
    onPrimary = Color.White,
    background = Color(0xFF121212),
    onBackground = Color.White,
    surface = Color(0xFF1F1F1F),
    onSurface = Color.White
)

@Composable
fun lightColorScheme() = lightColorScheme(
    primary = Color(0xFF6200EE),
    onPrimary = Color.White,
    background = Color(0xFFFFFFFF),
    onBackground = Color.Black,
    surface = Color(0xFFEEEEEE),
    onSurface = Color.Black
)

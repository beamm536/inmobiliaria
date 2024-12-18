package com.appclass.myapplication.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PantallaFormulario1(navController: NavController) {
    LlamadaFunciones(
        navController = navController,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CamposFormulario(modifier: Modifier = Modifier) {
    // Variables del selector de fecha
    var selectedDate by remember { mutableStateOf("") }
    val estado = rememberDatePickerState()
    var mostrarDialog by remember { mutableStateOf(false) }

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
            color = Color(0xFF202c41),
            modifier = Modifier.padding(bottom = 63.dp)
        )



        Text(
            text = "1. Datos personales",
            style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
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
                .fillMaxWidth()
                .height(56.dp),
            singleLine = true,
            label = { Text("Nombre") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF369d7c),
                unfocusedBorderColor = Color(0xFF8a9196),
                focusedLabelColor = Color(0xFF369d7c),
                unfocusedLabelColor = Color(0xFF8a9196),
                cursorColor = Color(0xFF369d7c)
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = apellidos,
            onValueChange = { apellidos = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            label = { Text("Apellidos") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF369d7c),
                unfocusedBorderColor = Color(0xFF8a9196),
                focusedLabelColor = Color(0xFF369d7c),
                unfocusedLabelColor = Color(0xFF8a9196),
                cursorColor = Color(0xFF369d7c)
            )
        )
        Spacer(modifier = Modifier.size(8.dp))

        OutlinedTextField(
            value = dni,
            onValueChange = { input ->
                dni = input.filter { it.isLetterOrDigit() } //para no permitir mas caracteres q no sean letras ni numeros
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            label = { Text("DNI/NIE") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF369d7c),
                unfocusedBorderColor = Color(0xFF8a9196),
                focusedLabelColor = Color(0xFF369d7c),
                unfocusedLabelColor = Color(0xFF8a9196),
                cursorColor = Color(0xFF369d7c)
            )
        )

        Spacer(modifier = Modifier.size(8.dp))



        Spacer(modifier = Modifier.size(32.dp))

        Text(
            text = "2. Datos de contacto",
            style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = telefono,
            onValueChange = { telefono = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            label = { Text("NºTeléfono") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF369d7c),
                unfocusedBorderColor = Color(0xFF8a9196),
                focusedLabelColor = Color(0xFF369d7c),
                unfocusedLabelColor = Color(0xFF8a9196),
                cursorColor = Color(0xFF369d7c)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Phone Icon",
                    tint = Color(0xFF369d7c) //aqui para el cambio de color
                )
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFF369d7c),
                unfocusedBorderColor = Color(0xFF369d7c),//color del borde - 0xFF8a9196
                focusedLabelColor = Color(0xFF369d7c),
                unfocusedLabelColor = Color(0xFF8a9196),
                cursorColor = Color(0xFF369d7c)
            ),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon",
                    tint = Color(0xFF369d7c) //aqui para el cambio de color
                )
            }
        )





        Spacer(modifier = Modifier.height(40.dp))


        // Botón "Guardar nota" (sin conexión a base de datos)
        OutlinedButton(
            onClick = {
                //navegacion a la siguiente pantalla
            },
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Transparent,
                contentColor = Color(0xFF369d7c)
            ),
            border = BorderStroke(2.dp, Color(0xFF369d7c))
        ) {
            Text("Siguiente")
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Icono de flecha derecha",
                modifier = Modifier.padding(start = 8.dp),
                tint = Color(0xFF369d7c) //color
            )
        }
    }
}





@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun LlamadaFunciones(navController: NavController, modifier: Modifier = Modifier) {
    CamposFormulario(modifier = modifier)
}

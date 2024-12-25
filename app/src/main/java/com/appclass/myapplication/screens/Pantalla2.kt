package com.appclass.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.text.font.FontWeight

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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
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
fun Pantalla2(navController: NavController){
    FunctionsCall2(
        navController = navController,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormFields2(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)) // Fondo claro
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Encabezado con imagen
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = Icons.Default.Home, // Icono de casa
                    contentDescription = "Real Estate Icon",
                    tint = Color(0xFF3F51B5),
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp)
                )
                Text(
                    text = "Reserva de Visita",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3F51B5),
                    modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
                )
            }

            // Formulario
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Nombre") },
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = "Nombre")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        Color.White,
                        focusedIndicatorColor = Color(0xFF3F51B5),
                        unfocusedIndicatorColor = Color.LightGray
                    )
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Apellidos") },
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = "Apellidos")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        Color.White,
                        focusedIndicatorColor = Color(0xFF3F51B5),
                        unfocusedIndicatorColor = Color.LightGray
                    )
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Teléfono") },
                    leadingIcon = {
                        Icon(Icons.Default.Phone, contentDescription = "Teléfono")
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone),
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        Color.White,
                        focusedIndicatorColor = Color(0xFF3F51B5),
                        unfocusedIndicatorColor = Color.LightGray
                    )
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    leadingIcon = {
                        Icon(Icons.Default.Email, contentDescription = "Email")
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        Color.White,
                        focusedIndicatorColor = Color(0xFF3F51B5),
                        unfocusedIndicatorColor = Color.LightGray
                    )
                )
            }

            // Botón
            Button(
                onClick = { /* Acción de siguiente */ },
                colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .height(50.dp)
            ) {
                Text("Siguiente", color = Color.White, fontSize = 18.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(Icons.Default.ArrowForward, contentDescription = "Siguiente", tint = Color.White)
            }

            // Pie de página
            Text(
                text = "Nuestros agentes se pondrán en contacto contigo pronto.",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

@Composable
fun FunctionsCall2(navController: NavController, modifier: Modifier = Modifier){
    FormFields2(modifier = modifier)
}
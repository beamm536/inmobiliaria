package com.appclass.myapplication.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.appclass.myapplication.R
import com.appclass.myapplication.ui.theme.GrisFondo
import com.appclass.myapplication.ui.theme.GrisOutlined
import com.appclass.myapplication.ui.theme.Purple40

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
//    // Variables del selector de fecha
//    var selectedDate by remember { mutableStateOf("") }
//    val estado = rememberDatePickerState()
//    var mostrarDialog by remember { mutableStateOf(false) }
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = modifier
//            .fillMaxSize()
//            .padding(start = 10.dp)
//    ) {
//        Spacer(modifier = Modifier.size(130.dp))
//        Text(
//            text = "Datos de reserva",
//            style = MaterialTheme.typography.titleLarge,
//            fontSize = 32.sp,
//            color = Color(0xFF202c41),
//            modifier = Modifier.padding(bottom = 63.dp),
//            //fontFamily = FuenteGoogle()
//        )
//
//
//
//        Text(
//            text = "1. Nombre Completo",
//            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
//            //fontWeight = FontWeight.Bold,
//            fontSize = 16.sp,
//            modifier = Modifier.align(Alignment.Start),
//            //fontFamily = FuenteGoogle()
//        )
//
//        // Variables del formulario para la base de datos
//        var nombre by remember { mutableStateOf("") }
//        var apellidos by remember { mutableStateOf("") }
//        var dni by remember { mutableStateOf("") }
//        var telefono by remember { mutableStateOf("") }
//        var email by remember { mutableStateOf("") }
//
//
//
//        // Campos de entrada
//        OutlinedTextField(
//            value = nombre,
//            onValueChange = { nombre = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//                //.height(56.dp),
//            singleLine = true,
//            label = { Text("Nombre") },
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            )
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = apellidos,
//            onValueChange = { apellidos = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//                //.height(56.dp),
//            label = { Text("Apellidos") },
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            )
//        )
//
//
//
//        Spacer(modifier = Modifier.size(32.dp))
//
//        Text(
//            text = "2. Datos de Contacto",
//            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
//            //fontWeight = FontWeight.Bold,
//            fontSize = 16.sp,
//            modifier = Modifier.align(Alignment.Start)
//        )
//
//        OutlinedTextField(
//            value = telefono,
//            onValueChange = { telefono = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//                //.height(56.dp),
//            label = { Text("Tlfno") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            ),
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Call,
//                    contentDescription = "Phone Icon",
//                    tint = GrisOutlined //aqui para el cambio de color
//                )
//            }
//        )
//
//        Spacer(modifier = Modifier.height(8.dp))
//
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            modifier = Modifier
//                .fillMaxWidth(),
//                //.height(56.dp),
//            label = { Text("Email") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
//            colors = OutlinedTextFieldDefaults.colors(
//                focusedBorderColor = GrisOutlined,
//                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
//                focusedLabelColor = GrisOutlined,
//                unfocusedLabelColor = GrisOutlined,
//                cursorColor = GrisOutlined
//            ),
//
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.Email,
//                    contentDescription = "Email Icon",
//                    tint = GrisOutlined //aqui para el cambio de color
//                )
//            }
//        )
//
//
//
//
//
//        Spacer(modifier = Modifier.height(40.dp))
//
//
//        // Botón "Guardar nota" (sin conexión a base de datos)
//        OutlinedButton(
//            onClick = {
//                //navegacion a la siguiente pantalla
//            },
//            colors = ButtonDefaults.outlinedButtonColors(
//                containerColor = Color(0xFF539df3)/*Color.Transparent,*/,
//                contentColor = Color(0xFFffffff)
//            ),
//            border = BorderStroke(2.dp, Color(0xFF539df3))
//        ) {
//            Text("Siguiente")
//            Icon(
//                imageVector = Icons.Default.ArrowForward,
//                contentDescription = "Icono de flecha derecha",
//                modifier = Modifier.padding(start = 8.dp),
//                tint = Color(0xFFFFffffff) //color
//            )
//        }
//    }
//}
//
////@Composable
////fun FuenteGoogle(): FontFamily{
////    val provider = GoogleFont.Provider(
////        providerAuthority = "com.google.android.gms.fonts",
////        providerPackage = "com.google.android.gms",
////        certificates = R.array.com_google_android_gms_fonts_certs
////        //esta fuente necesita un archivo array.xml que se genera con la importacion, y en el
////        //resources value --> com_google_android_gms_fonts_certs
////    )
////    val font = GoogleFont("Poppins") // Nombre de la fuente
////
////    return FontFamily(
////        Font(googleFont = font, fontProvider = provider)
////    )
////}
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF2196F3), Color(0xFFBBDEFB))
                )
            )
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            // Title
            Text(
                text = "Datos de reserva",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(16.dp)
            )

            // Form Fields
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Nombre") },
                        leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Nombre") }
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Apellidos") },
                        leadingIcon = {
                            Icon(
                                Icons.Default.Person,
                                contentDescription = "Apellidos"
                            )
                        }
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Teléfono") },
                        leadingIcon = {
                            Icon(
                                Icons.Default.Phone,
                                contentDescription = "Teléfono"
                            )
                        },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone)
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Email") },
                        leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email") },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
                    )
                }
            }

            // Next Button
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xFF42A5F5)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Siguiente", color = Color.White)
            }
        }
    }
}

@Composable
fun ColorDeFondo(){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(GrisFondo)
    )
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun LlamadaFunciones(navController: NavController, modifier: Modifier = Modifier) {
    ColorDeFondo()
    CamposFormulario(modifier = modifier)
}

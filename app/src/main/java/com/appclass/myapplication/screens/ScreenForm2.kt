package com.appclass.myapplication.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.appclass.myapplication.R
import com.appclass.myapplication.ui.theme.GrisOutlined
import com.appclass.myapplication.ui.theme.Poppins

@Composable
fun ScreenForm2(navController: NavController){
    FunctionsCall3(
        navController = navController,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}

@Composable
fun FormFields3(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding(start = 10.dp)
    ) {
        Spacer(modifier = Modifier.size(75.dp))
        Text(
            text = "Datos de reserva",
            //style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            fontFamily = Poppins,
            fontSize = 32.sp,
            color = Color(0xFF202c41),
            modifier = Modifier.padding(bottom = 63.dp),
            //fontFamily = FuenteGoogle()
        )



        Text(
            text = "3. Datos de Domicilio",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            fontFamily = Poppins,
            //style = MaterialTheme.typography.titleLarge, //titleLarge va a hacer referencia al FontWeight_Bold
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start),
            //fontFamily = FuenteGoogle()
        )

        // Variables del formulario para la base de datos
        var domicilio by remember { mutableStateOf("") }
        var ciudad by remember { mutableStateOf("") }
        var provincia by remember { mutableStateOf("") }
        var dni by remember { mutableStateOf("") }


        // Campos de entrada
        OutlinedTextField(
            value = domicilio,
            onValueChange = { domicilio = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            singleLine = true,
            label = { Text("Domicilio actual") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = ciudad,
            onValueChange = { ciudad = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("Ciudad") },
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = provincia,
            onValueChange = { provincia = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("Provincia") },
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
            text = "4. Otros datos:",
            //style = MaterialTheme.typography.titleSmall.copy(color = Color(0xFF00B0FF)),
            //fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.Start)
        )

        OutlinedTextField(
            value = dni,
            onValueChange = { dni = it },
            modifier = Modifier
                .fillMaxWidth(),
            //.height(56.dp),
            label = { Text("DNI/NIE") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            shape = MaterialTheme.shapes.large.copy(all = CornerSize(50.dp)),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = GrisOutlined,
                unfocusedBorderColor = GrisOutlined,//color del borde - 0xFF8a9196
                focusedLabelColor = GrisOutlined,
                unfocusedLabelColor = GrisOutlined,
                cursorColor = GrisOutlined
            ),
//            leadingIcon = {
//                Icon(
//                    imageVector = Icons.Default.,
//                    contentDescription = "Phone Icon",
//                    tint = GrisOutlined //aqui para el cambio de color
//                )
//            }
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ) {
            ImgDecorativa(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
        ){
            Button(
                onClick = { /* Acción de siguiente */ },
                colors = ButtonDefaults.buttonColors(Color(0xFF3F51B5)),
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .height(50.dp)
            ) {
                Text("enviar", color = Color.White, fontSize = 18.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    Icons.Default.Send,
                    contentDescription = "enviar formulario",
                    tint = Color.White
                )
            }
        }
    }
}

@Composable
fun ImgDecorativa(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.img_formulario_inmobiliaria), //cambiar esta imagen por el logo de la inmobiliaria
        contentDescription = "img formulario enviar",
        modifier = modifier
            .width(230.dp)
            .height(200.dp)
    )
}

@Composable
fun IndicadorProgreso(){

    //variables necesarias
    var progress by remember { mutableStateOf(0.5f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ){
        LinearProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.height(30.dp))
        Row {
            OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 0.5f
                }
            ) {
                Text("Increase")
            }

            OutlinedButton(
                onClick = {
                    if (progress > 0f) progress -= 0.5f
                }
            ) {
                Text("Decrease")
            }
        }

    }

}

@Composable
fun IndicadorProgresoConPasos() {
    // Variables necesarias
    var progress by remember { mutableStateOf(0.0f) } // Progreso inicial
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    // Definimos los pasos
    val steps = listOf("Paso 1", "Paso 2", "Paso 3") // Cambia según el número de pasos
    val currentStep = (progress * steps.size).toInt()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Indicador de progreso lineal
        LinearProgressIndicator(
            progress = animatedProgress,
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
        )
        Spacer(Modifier.height(16.dp))

        // Números debajo del indicador
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            steps.forEachIndexed { index, step ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    // Ícono: Check si está completado, número si no lo está
                    if (index < currentStep) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            tint = Color.Green,
                            modifier = Modifier.size(24.dp)
                        )
                    } else {
                        Text(
                            text = (index + 1).toString(),
                            color = if (index == currentStep) Color.Black else Color.Gray
                        )
                    }
                    // Etiqueta del paso
                    Text(
                        text = step
                    )
                }
            }
        }

        Spacer(Modifier.height(30.dp))

        // Botones para incrementar/disminuir el progreso
        Row {
            OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 1f / steps.size
                }
            ) {
                Text("Siguiente")
            }

            OutlinedButton(
                onClick = {
                    if (progress > 0f) progress -= 1f / steps.size
                }
            ) {
                Text("Anterior")
            }
        }
    }
}


@Composable
fun FunctionsCall3(navController: NavController, modifier: Modifier = Modifier){
    //IndicadorProgreso()
    IndicadorProgresoConPasos()
    FormFields3(modifier = modifier)
}
package com.example.vistasclientes.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.vistasclientes.R

@Composable
fun pantallaGraficasHeader(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp) // Altura del encabezado

    ) {
        // Fondo del encabezado
        val headerImage: Painter = painterResource(id = R.drawable.header_image)
        Image(
            painter = headerImage,
            contentDescription = "Encabezado",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Contenedor para las imágenes y el texto
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp) // Espaciado de los bordes
                .padding(top = 80.dp)
            ,
            verticalAlignment = Alignment.CenterVertically, // Centra verticalmente los elementos
            horizontalArrangement = Arrangement.SpaceBetween // Distribuye los elementos a los extremos
        ) {
            // Imagen izquierda
            val leftImage: Painter = painterResource(id = R.drawable.logo_header)
            Image(
                painter = leftImage,
                contentDescription = "Imagen izquierda",
                modifier = Modifier
                    .size(40.dp) // Tamaño de la imagen
            )

            // Texto en el centro
            Text(
                text = "GRÁFICAS",
                style = TextStyle(fontSize = 30.sp, color = Color.White),
                modifier = Modifier.weight(1f), // Hace que el texto ocupe el espacio disponible
                textAlign = TextAlign.Center // Centra el texto
            )

            // Imagen derecha (perfil) que navega a la pantalla de perfil al hacer clic
            val rightImage: Painter = painterResource(id = R.drawable.profile)
            Image(
                painter = rightImage,
                contentDescription = "Imagen perfil",
                modifier = Modifier
                    .size(40.dp) // Tamaño de la imagen
                    .clickable {
                        // Al hacer clic en la imagen, navega a la pantalla de perfil
                        navHostController.navigate("pantallaPerfil")
                    }
            )
        }
    }

}



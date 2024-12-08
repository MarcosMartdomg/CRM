package com.example.vistasclientes.header

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.vistasclientes.R

@Composable
fun pantallaAlmacenHeader(navHostController: NavController) {
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

        // Contenedor para las imágenes y el texto, centrado tanto horizontal como verticalmente
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp) // Espaciado de los bordes
                .padding(top = 70.dp), // Ajuste de la posición vertical para centrarlo
            verticalAlignment = Alignment.CenterVertically, // Centra verticalmente los elementos
            horizontalArrangement = Arrangement.Center // Centra todo el contenido de la fila
        ) {
            // Imagen izquierda
            val leftImage: Painter = painterResource(id = R.drawable.logo_header)
            Image(
                painter = leftImage,
                contentDescription = "Imagen izquierda",
                modifier = Modifier
                    .size(40.dp) // Tamaño de la imagen
            )

            // Espacio flexible entre los iconos y el texto
            Spacer(modifier = Modifier.weight(1f))

            // Texto en el centro (dividido en dos líneas)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally // Centra el texto
            ) {
                Text(
                    text = "ALMACÉN",
                    style = TextStyle(fontSize = 24.sp, color = Color.White), // Ajusta el tamaño de la fuente
                    modifier = Modifier.padding(bottom = 2.dp) // Separación entre las palabras
                )
            }

            // Espacio flexible entre el texto y el botón derecho
            Spacer(modifier = Modifier.weight(1f))

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

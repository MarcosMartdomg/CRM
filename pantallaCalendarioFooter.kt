package com.example.vistasclientes.footers

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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.vistasclientes.R

@Composable
fun pantallaCalendarioFooter(navHostController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp) // Altura del footer
            .padding(top = 16.dp) // Espaciado superior para que no se pegue al contenido
    ) {
        val footerImage = painterResource(id = R.drawable.header_image) // Usa la misma imagen del header
        Image(
            painter = footerImage,
            contentDescription = "Fondo del footer",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Contenedor de las imágenes alineadas horizontalmente
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter) // Alineamos al fondo del Box
                .padding(horizontal = 16.dp)
                .padding(bottom = 16.dp), // Espaciado lateral
            horizontalArrangement = Arrangement.SpaceBetween // Espaciado entre las imágenes
        ) {
            // Imágenes en el footer
            Image(
                painter = painterResource(id = R.drawable.home), // Imagen home
                contentDescription = "Home",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        navHostController.navigate("pantallaMenu")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.calendar), // Imagen calendario
                contentDescription = "Calendar",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        navHostController.navigate("pantallaCalendario")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.almacen), // Imagen almacen
                contentDescription = "Almacen",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        navHostController.navigate("pantallaAlmacen")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.graficas), // Imagen graficas
                contentDescription = "Graficas",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        navHostController.navigate("pantallaGraficas")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.ajustes), // Imagen ajustes
                contentDescription = "Ajustes",
                modifier = Modifier
                    .size(40.dp)
                    .clickable {
                        navHostController.navigate("pantallaAjustes")
                    }
            )
        }
    }
}
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.vistasclientes.R

@Composable
fun pantallaAlmacenFooter(navHostController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp) // Reduce la altura del footer para que los íconos estén más centrados
            .padding(top = 16.dp)
    ) {
        val footerImage: Painter = painterResource(id = R.drawable.header_image)
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
                .align(Alignment.Center) // Alinea los íconos al centro
                .padding(horizontal = 16.dp)
                .padding(bottom = 8.dp), // Reduce el padding inferior para que estén más arriba
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            // Los íconos del footer
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "Home",
                modifier = Modifier.size(40.dp)
                    .clickable {
                        // Al hacer clic en la imagen de gráficas, navega a la pantalla de gráficas
                        navHostController.navigate("pantallaMenu")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.calendar),
                contentDescription = "Calendar",
                modifier = Modifier.size(40.dp)
                    .clickable {
                        // Al hacer clic en la imagen de gráficas, navega a la pantalla de gráficas
                        navHostController.navigate("pantallaCalendario")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.almacen),
                contentDescription = "Almacen",
                modifier = Modifier.size(40.dp)
                    .clickable {
                        // Al hacer clic en la imagen de gráficas, navega a la pantalla de gráficas
                        navHostController.navigate("pantallaAlmacen")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.graficas),
                contentDescription = "Graficas",
                modifier = Modifier.size(40.dp)
                    .clickable {
                        // Al hacer clic en la imagen de gráficas, navega a la pantalla de gráficas
                        navHostController.navigate("pantallaGraficas")
                    }
            )
            Image(
                painter = painterResource(id = R.drawable.ajustes),
                contentDescription = "Ajustes",
                modifier = Modifier.size(40.dp)
                    .clickable {
                        // Al hacer clic en la imagen de gráficas, navega a la pantalla de gráficas
                        navHostController.navigate("pantallaAjustes")
                    }
            )
        }
    }
}

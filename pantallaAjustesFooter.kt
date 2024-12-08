package com.example.vistasclientes.footers

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.vistasclientes.R
import com.example.vistasclientes.screens.FooterIcon


@Composable
fun pantallaAjustesFooter(navHostController: NavHostController, isDarkMode: Boolean) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
    ) {
        val footerImage: Painter = painterResource(id = if (isDarkMode) R.drawable.header_image_dark else R.drawable.header_image)
        Image(
            painter = footerImage,
            contentDescription = "Fondo del footer",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FooterIcon(navHostController, if (isDarkMode) R.drawable.home_dark else R.drawable.home, "Home", "pantallaMenu")
            FooterIcon(navHostController, if (isDarkMode) R.drawable.calendar_dark else R.drawable.calendar, "Calendar", "pantallaCalendario")
            FooterIcon(navHostController, if (isDarkMode) R.drawable.almacen_dark else R.drawable.almacen, "Almacén", "pantallaAlmacen")
            FooterIcon(navHostController, if (isDarkMode) R.drawable.graficas_dark else R.drawable.graficas, "Gráficas", "pantallaGraficas")
            FooterIcon(navHostController, if (isDarkMode) R.drawable.ajustes_dark else R.drawable.ajustes, "Ajustes", "pantallaAjustes")
        }
    }
}

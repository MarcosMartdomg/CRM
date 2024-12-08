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
fun pantallaAjustesHeader(navHostController: NavHostController, isDarkMode: Boolean) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        val headerImage: Painter = painterResource(id = if (isDarkMode) R.drawable.header_image_dark else R.drawable.header_image)
        Image(
            painter = headerImage,
            contentDescription = "Encabezado",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(top = 70.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val leftImage: Painter = painterResource(id = if (isDarkMode) R.drawable.logo_header_dark else R.drawable.logo_header)
            Image(
                painter = leftImage,
                contentDescription = "Logo",
                modifier = Modifier.size(40.dp)
            )

            Text(
                text = "AJUSTES",
                style = TextStyle(fontSize = 30.sp, color = if (isDarkMode) Color.White else Color.Black),
                textAlign = TextAlign.Center
            )

            val rightImage: Painter = painterResource(id = if (isDarkMode) R.drawable.profile_dark else R.drawable.profile)
            Image(
                painter = rightImage,
                contentDescription = "Perfil",
                modifier = Modifier
                    .size(40.dp)
                    .clickable { navHostController.navigate("pantallaPerfil") }
            )
        }
    }
}
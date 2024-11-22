package com.example.pantallas.Pantallas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.pantallas.R
import org.w3c.dom.Text


@Composable
fun GestionEmpleados3(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), // Asegura un fondo uniforme
        verticalArrangement = Arrangement.SpaceBetween // Distribuye el contenido entre el header, perfil y footer
    ) {
        // Encabezado
        Header3(navHostController)

        // Perfil y tareas
        Column(modifier = Modifier.weight(1f)) { // Usa weight para que el contenido ocupe el espacio disponible
            Spacer(modifier = Modifier.height(16.dp))
            // Pasa navHostController a PerfilUsuario1
            PerfilUsuario3(navHostController) // Aquí lo estamos pasando
        }

        // Footer
        Footer2()
    }
}


@Composable
fun Header3(navHostController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp) // Altura del encabezado
    ) {
        // Fondo del encabezado
        val headerImage: Painter = painterResource(id = R.drawable.headerf)
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
                .padding(top = 40.dp), // Ajuste de la posición vertical para centrarlo
            verticalAlignment = Alignment.CenterVertically, // Centra verticalmente los elementos
            horizontalArrangement = Arrangement.Center // Centra todo el contenido de la fila
        ) {
            // Imagen izquierda
            val leftImage: Painter = painterResource(id = R.drawable.logo)
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
                    text = "Gestión",
                    style = TextStyle(fontSize = 20.sp, color = Color.White), // Ajusta el tamaño de la fuente
                    modifier = Modifier.padding(bottom = 2.dp) // Separación entre las palabras
                )
                Text(
                    text = "de Empleados",
                    style = TextStyle(fontSize = 20.sp, color = Color.White), // Mismo tamaño para mantener la coherencia
                )
            }

            // Espacio flexible entre el texto y el botón derecho
            Spacer(modifier = Modifier.weight(1f))

            // Imagen derecha (perfil) que navega a la pantalla de perfil al hacer clic
            val rightImage: Painter = painterResource(id = R.drawable.perfil)
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



@Composable
fun Footer2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp) // Reduce la altura del footer para que los íconos estén más centrados
            .padding(top = 16.dp)
    ) {
        val footerImage: Painter = painterResource(id = R.drawable.headerf)
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
            )
            Image(
                painter = painterResource(id = R.drawable.calendario),
                contentDescription = "Calendar",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.almacen),
                contentDescription = "Almacen",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.graficas),
                contentDescription = "Graficas",
                modifier = Modifier.size(40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ajustes),
                contentDescription = "Ajustes",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}


@Composable
fun PerfilUsuario3(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            // Tarjeta combinada para perfil y tareas
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    // Sección del perfil
                    Row(
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Imagen del perfil (más grande)
                        Image(
                            painter = painterResource(id = R.drawable.perfil), // Cambia por tu recurso de imagen
                            contentDescription = "Foto de perfil",
                            modifier = Modifier
                                .size(140.dp) // Tamaño más grande
                                .border(1.dp, Color.Black)
                                .background(Color.White) // Fondo blanco para la imagen
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        // Información del perfil (desplazado a la derecha)
                        Column(
                            modifier = Modifier.padding(start = 16.dp) // Añadido para desplazar el texto hacia la derecha
                        ) {
                            Text(
                                text = "Perfil",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "Nombre: Peter Check")
                            Text(text = "Edad: 30")
                            Text(text = "Trabajo: Seguridad")
                            Text(text = "Promedio: 92%")
                        }
                    }

                    // Sección de tareas
                    Text(
                        text = "TAREAS",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    val tasks = listOf(
                        "Preparar Inventario",
                        "Comprobar precios",
                        "Caja registradora",
                        "Analista de Datos",
                        "Seguridad"
                    )
                    tasks.forEach { task ->
                        // Elemento con fondo blanco para cada tarea
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp), // Más espacio entre cada tarea
                            shape = RoundedCornerShape(8.dp),
                            border = BorderStroke(1.dp, Color.Black)
                        ) {
                            Row(
                                modifier = Modifier
                                    .background(Color.White) // Fondo blanco para toda la fila
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Fondo blanco para el texto
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .background(Color.White) // Fondo blanco para el texto
                                        .padding(4.dp) // Margen interno del texto
                                ) {
                                    Text(
                                        text = task,
                                        fontSize = 16.sp
                                    )
                                }

                                // Checkbox con fondo blanco
                                Checkbox(
                                    checked = false,
                                    onCheckedChange = {},
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(45.dp)) // Espacio entre tareas y paginación

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Botón "Ant."
                OutlinedButton(
                    onClick = { "GestionEmpleados2" },
                    modifier = Modifier
                        .height(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Flecha izquierda"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Ant.")
                }

                // Contenedor central para el texto "3/3"
                Box(
                    modifier = Modifier
                        .weight(1f) // Hace que el texto se centre entre los botones
                        .wrapContentWidth(Alignment.CenterHorizontally) // Alinea el texto en el centro
                ) {
                    Text(
                        text = "3/3",
                        fontSize = 16.sp,
                        modifier = Modifier.align(Alignment.Center),
                        textAlign = TextAlign.Center
                    )
                }

                // Botón "Sig."
                OutlinedButton(
                    onClick = { "GestionEmpleados3" },
                    modifier = Modifier
                        .height(40.dp)
                        .clip(RoundedCornerShape(12.dp))
                ) {
                    Text(text = "Sig.")
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Flecha derecha"
                    )
                }
            }
        }
    }
}

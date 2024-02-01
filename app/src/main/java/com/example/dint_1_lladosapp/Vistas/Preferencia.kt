package com.example.dint_1_lladosapp.Vistas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dint_1_lladosapp.R
import com.example.dint_1_lladosapp.cabecera.Cabecera
import com.example.dint_1_lladosapp.data.Routes
import com.example.dint_1_lladosapp.pie.Pie
import com.example.dint_1_lladosapp.preferencia.Preferencia
import com.example.dint_1_lladosapp.preferenciausuario.PreferenciaUsuario

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Preferencias(navController: NavHostController) {
    Scaffold(
        topBar = {
            Cabecera(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp), titulo = "Preferencias",
                onLogo = {navController.navigate(Routes.Inicio.routes)},
                onAjuste = {navController.navigate(Routes.Preferencia.routes)},
                ajuste = painterResource(R.drawable.preferencia_verde) )
        },
        bottomBar = {
            Pie(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
                onInicio = {navController.navigate(Routes.Inicio.routes)},
                onComprar = {navController.navigate(Routes.Compras.routes)},
                onMensaje = {navController.navigate(Routes.Mensaje.routes)},
                onTarea = {navController.navigate(Routes.SalaTu1millon.routes)},
                onInicioSesion = { navController.navigate(Routes.InicioSesion.routes) },
                inicio = painterResource(R.drawable.home),
                comprar = painterResource(R.drawable.pie_comprar_login_1),
                login = painterResource(R.drawable.pie_inicio_session_login_1),
                mensajes = painterResource(R.drawable.pie_mensajes_login_1),
                tareas = painterResource(R.drawable.pie_tareas_login_1)
            )
        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            PreferenciaUsuario(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                boton1 = {navController.navigate(Routes.Inicio.routes)},
                boton2 = {navController.navigate(Routes.Inicio.routes)})
        }
    }
}
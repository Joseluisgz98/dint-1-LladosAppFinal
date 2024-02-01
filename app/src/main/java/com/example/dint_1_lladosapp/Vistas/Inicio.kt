package com.example.dint_1_lladosapp.Vistas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.dint_1_lladosapp.R
import com.example.dint_1_lladosapp.cabecera.Cabecera
import com.example.dint_1_lladosapp.data.Routes
import com.example.dint_1_lladosapp.inicio.Inicio
import com.example.dint_1_lladosapp.pie.Pie


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaginaInicio(navController: NavHostController) {
    Scaffold(
        topBar = {
            Cabecera(modifier = Modifier
                .fillMaxWidth()
                .height(56.dp), titulo = "Inicio",
                onLogo = {navController.navigate(Routes.Inicio.routes)},
                onAjuste = {navController.navigate(Routes.Preferencia.routes)},
                ajuste = painterResource(R.drawable.cabecera_ajuste)
            )
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
                inicio = painterResource(R.drawable.pie_inicio_login_1),
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
           Inicio(
               botonComprar = {navController.navigate(Routes.Compras.routes)},
               textoInicio = AnnotatedString("En 2015 solo tenía 50 euros en mi cuenta del banco dormia en habitaciones con mas de 10 personas y escapaba de mi vida con las drogas.\n" +
                       "\n" +
                       "Actualmente no bebo ,no me drogo y no salgo de fiesta. Soy millonario y genero mas de 400k al mes")
           )
        }
    }
}

package com.example.dint_1_lladosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.example.dint_1_lladosapp.ui.theme.Dint1LladosAppTheme
import androidx.navigation.compose.rememberNavController
import com.example.dint_1_lladosapp.Vistas.PaginaInicio
import androidx.navigation.compose.composable
import com.example.dint_1_lladosapp.Vistas.Login
import com.example.dint_1_lladosapp.Vistas.MillonSupp
import com.example.dint_1_lladosapp.Vistas.Preferencias
import com.example.dint_1_lladosapp.Vistas.SalaAfiliado
import com.example.dint_1_lladosapp.Vistas.Tu1Millon
import com.example.dint_1_lladosapp.data.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dint1LladosAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,startDestination = Routes.Inicio.routes){
                        composable(Routes.Inicio.routes){ PaginaInicio(navController)}
                        composable(Routes.Preferencia.routes){ Preferencias(navController)}
                        composable(Routes.Compras.routes){ MillonSupp(navController)}
                        composable(Routes.Mensaje.routes){ SalaAfiliado(navController)}
                        composable(Routes.SalaTu1millon.routes){ Tu1Millon(navController)}
                        composable(Routes.InicioSesion.routes){ Login(navController)}
                    }
                }
            }
        }
    }


    }

//A
//figd_iMXxZlsDjyoNiITgJ47t6D5YQPCWlT4hATKqn27v
package com.example.dint_1_lladosapp.data

sealed class Routes(val routes:String){
    object Inicio: Routes("Inicio")
    object Preferencia: Routes("Preferencia")
    object Compras: Routes("Millon supp")
    object Mensaje: Routes("Sala Afiliado")
    object SalaTu1millon: Routes("Sala tu1millon")
    object InicioSesion:Routes("Login")
}

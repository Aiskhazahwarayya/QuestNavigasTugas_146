package com.example.prak5

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cn.view.WelcomeScreen
import com.example.prak5.view.TampilData

enum class Halaman {
    Welcome,
    TampilData,
    FormPendaftaran
}


@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Halaman.Welcome.name,
        modifier = modifier
    ) {
        composable(route = Halaman.Welcome.name) {
            WelcomeScreen(
                onSubmitClick = {
                    navController.navigate(Halaman.TampilData.name)
                }
            )
        }
        composable(route = Halaman.TampilData.name) {
            TampilData(
                namaLengkap = "Aiskha",
                jenisKelamin = "Perempuan",
                statusPerkawinan = "Lajang",
                alamat = "Bekasi",
                onBerandaClick = {
                    navController.navigate(Halaman.Welcome.name) {
                        popUpTo(Halaman.Welcome.name) { inclusive = true }
                    }
                },
                onFormulirClick = {
                    navController.navigate(Halaman.FormPendaftaran.name)
                }
            )
        }

    }
}

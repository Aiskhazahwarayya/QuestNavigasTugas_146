package com.example.prak5.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    namaLengkap: String,
    jenisKelamin: String,
    statusPerkawinan: String,
    alamat: String,
    onBerandaClick: () -> Unit,
    onFormulirClick: () -> Unit
) {
    val Purple500 = Color(0xFFB388FF)
    val Lavender = Color(0xFFF3E5F5)
    val LightPurple = Color(0xFFFFFFFF)
    val DeepPurple = Color(0xFF7C3AED)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "List Daftar Peserta",
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Purple500
                )
            )
        }
    ){

    }
}
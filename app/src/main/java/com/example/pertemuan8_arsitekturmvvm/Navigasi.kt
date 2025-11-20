package com.example.pertemuan8_arsitekturmvvm

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan8_arsitekturmvvm.model.DataJK.JenisK
import com.example.pertemuan8_arsitekturmvvm.view.FormSiswa
import com.example.pertemuan8_arsitekturmvvm.view.TampilSiswa
import com.example.pertemuan8_arsitekturmvvm.viewmodel.SiswaViewModel


enum class Navigasi {
    Formulir,
    Detail
}


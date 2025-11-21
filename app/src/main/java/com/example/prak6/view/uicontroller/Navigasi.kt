package com.example.prak6.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.prak6.viewmodel.SiswaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

enum class Navigasi {
    Formulirku,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        Text(
            text = "Navigasi akan dimuat di sini",
            modifier = Modifier.padding(isiRuang)
        )
    }
}
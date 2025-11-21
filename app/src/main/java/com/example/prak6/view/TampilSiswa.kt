package com.example.prak6.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.prak6.R
import com.example.prak6.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    statusUiSiswa: Siswa,
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.jenis_kelamin), statusUiSiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUiSiswa.alamat),
    )

    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id= R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id= R.color.purple_500))
            )
        }){ isiRuang ->

        Text(
            text = "Data akan muncul di sini",
            modifier = Modifier.padding(isiRuang)
        )
    }
}
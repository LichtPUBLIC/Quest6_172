package com.example.prak6.viewmodel

import androidx.lifecycle.ViewModel
import com.example.prak6.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())

    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
}
package com.example.prak5

import androidx.compose.runtime.Composable

@Composable
fun FormDataDiri(modifier: Modifier){
    //variaable - variable untuk mengingat nilai masukan dari keyboard
    var textName by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJk by remember {mutableStateOf(value="")}
    var gender.List<string> = ListOf("Laki-laki", "Perempuan")


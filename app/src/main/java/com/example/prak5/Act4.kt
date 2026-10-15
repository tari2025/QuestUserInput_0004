package com.example.prak5

import androidx.compose.runtime.Composable

@Composable
fun FormDataDiri(modifier: Modifier){
    //variaable - variable untuk mengingat nilai masukan dari keyboard
    var textName by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJk by remember {mutableStateOf(value="")}
    var gender.List<string> = ListOf("Laki-laki", "Perempuan")

    //variable untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value="")}
    var alamat by remember {mutableStateOf(value="")}
    var jenis by remember {mutableStateOf(value="")}
    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Outline
    }
}
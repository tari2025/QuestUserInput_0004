package com.example.prak5

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun FormDataDiri(modifier: Modifier){
    //variaable - variable untuk mengingat nilai masukan dari keyboard
    var textName by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJk by remember {mutableStateOf(value="")}
    var gender:List<String> = listOf("Laki-laki", "Perempuan")

    //variable untuk menyimpan data yang diperoleh dari komponen UI
    var nama by remember {mutableStateOf(value="")}
    var alamat by remember {mutableStateOf(value="")}
    var jenis by remember {mutableStateOf(value="")}
    Column(modifier = modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = Textnama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),


        )
    }
}
@Composable
fun
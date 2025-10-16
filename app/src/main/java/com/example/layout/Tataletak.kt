package com.example.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text =  "komponen1")
        Text(text =  "komponen2")
        Text(text =  "komponen3")
        Text(text =  "komponen4")
    }
}

@Composable
fun TataletakColumn2(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 50.dp)) {
        Text(text =  "komponen1")
        Text(text =  "komponen2")
        Text(text =  "komponen3")
        Text(text =  "komponen4")
    }
}

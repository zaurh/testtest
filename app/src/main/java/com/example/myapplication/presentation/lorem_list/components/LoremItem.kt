package com.example.myapplication.presentation.lorem_list.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.domain.model.Lorem

@Composable
fun LoremItem(
    lorem: Lorem
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        Column {
            Text(text = lorem.id.toString())
            Text(text = lorem.title)
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add to Fav")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "My favs")
            }
        }
    }
}
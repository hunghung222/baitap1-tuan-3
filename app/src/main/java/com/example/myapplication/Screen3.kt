package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen3(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Màn hình 3", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack("screen1", inclusive = false) }) {
            Text("Quay lại màn hình 1")
        }
    }
}

package com.example.myapplication.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TextDetailScreen(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally  // Căn giữa theo chiều ngang
    ) {
        // Tiêu đề nằm trên cùng và căn giữa theo chiều ngang
        Text(
            text = "Text Detail",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .clickable { navController?.popBackStack() }
                .padding(bottom = 16.dp)
        )

        // Khoảng cách để đẩy nội dung xuống giữa
        Spacer(modifier = Modifier.weight(1f))

        // Nội dung văn bản căn giữa màn hình
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "The quick Brown",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "fox jumps over",
                fontSize = 22.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "the lazy dog.",
                fontSize = 22.sp
            )
        }

        // Khoảng cách để giữ nội dung ở giữa
        Spacer(modifier = Modifier.weight(1f))
    }
}

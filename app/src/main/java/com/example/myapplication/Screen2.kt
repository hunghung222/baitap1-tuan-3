package com.example.myapplication.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Screen2(navController: NavController? = null) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "UI Components List",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        SectionTitle("Display")
        ComponentCard("Text", "Displays text") {
            navController?.navigate("textDetail")  // Chuyển đến màn hình TextDetailScreen
        }
        ComponentCard("Image", "Displays an image") {
            navController?.navigate("imageGrid")  // Chuyển đến màn hình ImageGridScreen
        }
        ComponentCard("TextField", "Input field for text") {
            navController?.navigate("textFieldDetail") // Chuyển đến màn hình chi tiết TextField
        }


        SectionTitle("Input")
        ComponentCard("TextField", "Input field for text")
        ComponentCard("PasswordField", "Input field for passwords")

        SectionTitle("Layout")
        ComponentCard("Column", "Arranges elements vertically")
        ComponentCard("Row", "Arranges elements horizontally")
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun ComponentCard(title: String, description: String, onClick: (() -> Unit)? = null) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color(0xFFB3E5FC), shape = RoundedCornerShape(8.dp))
            .clickable { onClick?.invoke() } // Xử lý khi bấm vào thẻ
            .padding(16.dp)
    ) {
        Text(text = title, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = description, fontSize = 14.sp)
    }
}

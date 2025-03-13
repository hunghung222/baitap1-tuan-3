package com.example.myapplication.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R  // Import ảnh từ resources
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ImageGridScreen(navController: NavController? = null) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tiêu đề nằm trên đầu
        Text(
            text = "Image Grid",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.primary,
            modifier = Modifier
                .clickable { navController?.popBackStack() }
                .padding(bottom = 16.dp)
        )

        // Grid chứa 9 ảnh
        Column {
            repeat(3) { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    repeat(3) { col ->
                        ImageItem(imageResId = R.drawable.love_image) // Thay bằng ID ảnh của bạn
                    }
                }
                Spacer(modifier = Modifier.height(8.dp)) // Khoảng cách giữa các hàng
            }
        }
    }
}

@Composable
fun ImageItem(imageResId: Int) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = "Sample Image",
        modifier = Modifier
            .size(100.dp)  // Kích thước hình vuông
            .padding(4.dp)
    )
}

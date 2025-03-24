package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.compose.*
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.WelcomeScreen  // Màn hình 1
import com.example.myapplication.ui.Screen2       // Màn hình 2
import com.example.myapplication.ui.TextDetailScreen // Màn hình chi tiết văn bản
import com.example.myapplication.ui.ImageGridScreen
import com.example.myapplication.ui.TextFieldDetailScreen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen {
                navController.navigate("screen2")  // Chuyển đến màn hình 2 khi nhấn nút
            }
        }
        composable("screen2") {
            Screen2(navController) // Truyền NavController để xử lý điều hướng
        }
        composable("textDetail") {
            TextDetailScreen(navController) // Thêm màn hình chi tiết văn bản
        }
        composable("imageGrid") {
            ImageGridScreen(navController)
        }
        composable("textFieldDetail") {
            TextFieldDetailScreen(navController)
        }

    }
}

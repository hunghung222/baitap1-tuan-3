plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.myapplication"  // ✅ Thêm namespace

    compileSdk = 35 // ✅ OK

    defaultConfig {
        minSdk = 24  // ✅ Hợp lý
        targetSdk = 35
    }

    buildFeatures {
        compose = true  // ✅ Bật Jetpack Compose
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"  // ✅ Dùng đúng phiên bản bạn yêu cầu
        kotlinCompilerExtensionVersion = "1.5.4"
    }

    buildTypes {  // ❌ Sai vị trí đóng ngoặc → ĐÃ SỬA
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {  // ❌ Sai vị trí đóng ngoặc → ĐÃ SỬA
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // ✅ Jetpack Compose (Bổ sung nếu chưa có trong `libs.versions.toml`)
    implementation("androidx.compose.ui:ui:1.2.0")
    implementation("androidx.compose.material:material:1.2.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.0")
    implementation("androidx.navigation:navigation-compose:2.5.0")
}

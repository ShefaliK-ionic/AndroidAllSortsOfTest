plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.androidallsortsoftest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidallsortsoftest"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    testOptions {
        unitTests {
            all {
                it.enabled = true
            }
        }
}}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("org.testng:testng:6.9.6")
    implementation(libs.androidx.junit.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    testImplementation(
        "org.junit.jupiter:junit-jupiter-params:5.9.0"
    )


//    implementation ("androidx.test.ext:junit-ktx:1.1.3")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.3.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.3.0")
//    implementation ("androidx.test.espresso:espresso-idling-resource:3.3.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-idling-resource:3.3.0")

//    androidTestImplementation ("androidx.test:runner:1.3.0")
//    androidTestImplementation ("androidx.test:rules:1.3.0")
//
//    androidTestImplementation ("androidx.test.ext:junit:1.1.2")
////    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.3.0")

//    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    implementation ("com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava")
   implementation("androidx.test.espresso:espresso-intents:3.6.0-rc01")
    implementation("com.google.code.gson:gson:2.10.1")

}
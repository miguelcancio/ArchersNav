plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.mobdeve.group5.archersnav"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mobdeve.group5.archersnav"
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
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.room.common)
    implementation(libs.room.runtime)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.legacy.support.v4)
    implementation(libs.play.services.location)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Add Glide dependencies
    implementation("com.github.bumptech.glide:glide:4.15.1") // Glide dependency
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1") // Glide annotation processor
    implementation ("androidx.recyclerview:recyclerview:1.2.0")
    annotationProcessor(libs.room.compiler)  // or the appropriate version


}
// Apply the Google services plugin
apply(plugin = "com.google.gms.google-services")
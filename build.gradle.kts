// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.4.2")  // AGP (Android Gradle Plugin)
        classpath("com.google.gms:google-services:4.3.15")  // Firebase plugin
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}
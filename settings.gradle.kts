pluginManagement {
    repositories {
        google()  // Add Google's Maven repository
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositories {
        google()  // Add Google's Maven repository
        mavenCentral()
    }
}

rootProject.name = "ArchersNav"
include(":app")
 
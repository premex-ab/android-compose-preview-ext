plugins {
    kotlin("jvm") version "1.9.23" apply false
}

allprojects {
    group = "se.premex.compose.preview"
    version = "1.0.0"
    
    repositories {
        mavenCentral()
        google()
    }
}
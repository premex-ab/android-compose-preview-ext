plugins {
    kotlin("jvm") version "2.2.10" apply false
}

// Read version from env var first, then gradle.properties, then default
val projectVersion = System.getenv("VERSION_NAME") 
    ?: project.findProperty("version")?.toString() 
    ?: "1.0.0-SNAPSHOT"

group = "se.premex.compose.preview"
version = projectVersion


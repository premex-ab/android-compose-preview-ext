plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation("com.squareup:kotlinpoet:2.2.0")
    implementation("com.opencsv:opencsv:5.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("se.premex.compose.preview.generator.DeviceGeneratorKt")
}
plugins {
    kotlin("jvm")
    application
}

dependencies {
    implementation("com.squareup:kotlinpoet:1.16.0")
    implementation("com.opencsv:opencsv:5.9")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.premex.compose.preview.generator.DeviceGeneratorKt")
}
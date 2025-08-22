plugins {
    kotlin("jvm")
    `maven-publish`
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    jvmToolchain(11)
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            
            pom {
                name.set("Android Compose Preview Extensions")
                description.set("Extended device specifications for Android Compose previews")
                url.set("https://github.com/premex-ab/android-compose-preview-ext")
                
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                
                developers {
                    developer {
                        id.set("premex-ab")
                        name.set("Premex AB")
                        url.set("https://github.com/premex-ab")
                    }
                }
                
                scm {
                    url.set("https://github.com/premex-ab/android-compose-preview-ext")
                    connection.set("scm:git:git://github.com/premex-ab/android-compose-preview-ext.git")
                    developerConnection.set("scm:git:ssh://git@github.com/premex-ab/android-compose-preview-ext.git")
                }
            }
        }
    }
    
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/premex-ab/android-compose-preview-ext")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
}
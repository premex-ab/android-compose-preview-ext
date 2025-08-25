plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka") version "2.0.0"
    id("com.vanniktech.maven.publish") version "0.34.0"
}

mavenPublishing {

    publishToMavenCentral()

    // signAllPublications() if on CI
    if (System.getenv("CI") == "true") {
        signAllPublications()
    }

    pom {
        name.set("Android Compose Preview Extensions")
        description.set("Extended device specifications for Android Compose previews")
        inceptionYear.set("2025")
        url.set("https://github.com/premex-ab/android-compose-preview-ext")
        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
                distribution.set("https://opensource.org/licenses/MIT")
            }
        }
        developers {
            developer {
                id.set("warting")
                name.set("Stefan Wärting")
                url.set("https://github.com/warting/")
            }
        }
        scm {
            url.set("https://github.com/premex-ab/android-compose-preview-ext")
            connection.set("scm:git:git://github.com/premex-ab/android-compose-preview-ext.git")
            developerConnection.set("scm:git:ssh://git@github.com/premex-ab/android-compose-preview-ext.git")
        }
    }
}

val PUBLISH_GROUP_ID: String by extra(rootProject.group as String)
val PUBLISH_VERSION: String by extra(rootProject.version as String)
val PUBLISH_ARTIFACT_ID by extra("flow")

group = PUBLISH_GROUP_ID
version = PUBLISH_VERSION

dependencies {
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

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "android-compose-preview-ext"

include(":library")
include(":device-generator")
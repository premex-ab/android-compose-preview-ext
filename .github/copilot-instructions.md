# Android Compose Preview Extensions

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

This is a Kotlin library that provides device specifications for Android Jetpack Compose previews, supporting 24,000+ devices across 2,600+ manufacturers including enterprise handhelds (Zebra, Honeywell, Datalogic) and consumer devices.

## Working Effectively

### Bootstrap and Build
- `./gradlew clean` -- cleans all build artifacts. Takes 45-50 seconds on first run due to Gradle setup. NEVER CANCEL. Set timeout to 90+ minutes.
- `./gradlew build` -- compiles library and device-generator modules. Takes 40-45 seconds. NEVER CANCEL. Set timeout to 60+ minutes.
- `./gradlew test` -- runs all tests. Takes 1-2 seconds when already built. Set timeout to 30+ minutes for clean builds.

### Device Generation (Core Functionality)
- `./gradlew :device-generator:run` -- downloads Android Device Catalog and generates 2,600+ manufacturer device files. Takes 4-6 seconds. NEVER CANCEL. Set timeout to 30+ minutes.
- Device generator creates ~145,000 lines of Kotlin code in `android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/device/catalog/android/`
- Also generates documentation in `docs/devices/` with per-manufacturer device lists

### Publishing and Release
- `./gradlew publishAllPublicationsToMavenCentralRepository` -- publishes to Maven Central (requires credentials)

## Validation

### Always Run These Validation Steps After Changes
1. **Build validation**: `./gradlew build` -- must complete successfully
2. **Test validation**: `./gradlew test` -- all tests must pass  
3. **Device generation validation**: `./gradlew :device-generator:run` -- must complete without errors
4. **Manual validation**: Check that generated device constants return correct spec strings like `spec:width=1080px,height=2160px,dpi=480`

### Manual Testing Scenarios
- Import a generated manufacturer: `import se.premex.compose.preview.device.catalog.android.Zebra`
- Verify device constants work: `Zebra.TC27` should return `"spec:width=1080px,height=2160px,dpi=480"`
- Test preview usage: `@Preview(device = Zebra.TC27)` should be valid Compose syntax

### Build Requirements
- **Java**: JDK 17 minimum (build files specify JDK 21 toolchain but JDK 17 works)
- **Gradle**: Uses Gradle 9.0.0 (downloaded automatically by gradlew)
- **Internet**: Device generator requires internet access to download Android Device Catalog CSV

### Limitations
- No lint/format tools configured beyond standard Kotlin compilation
- Build shows deprecation warnings but they don't affect functionality  
- Cannot test UI interactively - this is a library, not an application
- Device generator requires live internet connection to Android Device Catalog

## Common Tasks

### Repository Structure
```
.
├── README.md                    # Main documentation
├── android-compose-preview-ext/ # Library module (main deliverable)  
│   ├── build.gradle.kts        # Library build config with Maven publishing
│   └── src/
│       ├── main/kotlin/        # Generated device catalog files (~145k lines)
│       └── test/kotlin/        # Basic validation tests
├── device-generator/           # Code generator module
│   ├── build.gradle.kts       # Generator build config  
│   └── src/main/kotlin/       # Device catalog fetcher and Kotlin code generator
├── docs/devices/              # Generated device documentation (2,600+ files)
├── .github/workflows/         # CI/CD pipelines
├── build.gradle.kts          # Root build configuration
└── settings.gradle.kts       # Multi-module setup
```

### Key Files and Locations
- **Main library module**: `android-compose-preview-ext/`
- **Generated device files**: `android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/device/catalog/android/*.kt`
- **Tests**: `android-compose-preview-ext/src/test/kotlin/se/premex/compose/preview/UsageExamplesTest.kt`
- **Device generator**: `device-generator/src/main/kotlin/se/premex/compose/preview/generator/DeviceGenerator.kt`
- **CI configuration**: `.github/workflows/ci.yml`

### Build Process Details
The build process:
1. **Root project setup** (~5s) - configures multi-module Gradle project
2. **Library compilation** (~15s) - compiles main library and generated device files  
3. **Device generator compilation** (~10s) - compiles generator module
4. **Test execution** (~1s) - runs validation tests
5. **Packaging** (~10s) - creates JAR files and sources

### Device Generator Details
- Downloads CSV from Android Device Catalog (Google Play Store maintained)
- Processes ~24,300 device specifications 
- Generates one Kotlin object per manufacturer (e.g., `Zebra.kt`, `Samsung.kt`)
- Each device becomes a constant: `const val TC27: String = "spec:width=1080px,height=2160px,dpi=480"`
- Updates README.md statistics between `<!-- SUPPORTED_DEVICE_STATS_START -->` markers

### CI/CD Pipeline Information  
- **Build workflow**: Runs on push/PR to main branch
- **Device update workflow**: Runs weekly to refresh device catalog
- **Publishing workflow**: Triggers on GitHub releases
- **Auto-merge workflow**: Handles dependency updates

### Common Commands Output

#### gradlew tasks
Key available tasks:
- `build` - Full build of both modules
- `test` - Run all tests  
- `clean` - Clean all build outputs
- `check` - Run all validation checks
- `:device-generator:run` - Execute device catalog generator
- `:android-compose-preview-ext:publishToMavenLocal` - Publish to local Maven repo

#### Generated Device File Example
```kotlin
// Generated manufacturer device catalog. Devices=3
package se.premex.compose.preview.device.catalog.android

import kotlin.String

/**
 * Device specifications for Zebra (3 models).
 */
public object Zebra {
  /**
   * Zebra TC27
   */
  public const val TC27: String = "spec:width=1080px,height=2160px,dpi=480"
  
  /**
   * Zebra TC26  
   */
  public const val TC26: String = "spec:width=720px,height=1280px,dpi=320"
}
```

### Typical Development Workflow
1. Make changes to library or generator code
2. Run `./gradlew build` to ensure compilation succeeds
3. Run `./gradlew test` to verify tests pass
4. If modifying generator: run `./gradlew :device-generator:run` to regenerate devices
5. Commit changes including any generated files
6. Push to trigger CI validation

### Troubleshooting
- **Build fails with Java version error**: Install JDK 17 or higher
- **Device generator fails**: Check internet connection for Android Device Catalog access  
- **Out of memory during build**: Increase heap size in `gradle.properties` (currently 2GB)
- **Deprecation warnings**: Safe to ignore - they don't affect functionality
- **Missing generated files**: Run `./gradlew :device-generator:run` to regenerate

### Performance Notes
- **NEVER CANCEL long-running commands** - builds may take 45+ minutes, device generation 30+ minutes in worst case
- Use appropriate timeouts: 60+ minutes for builds, 30+ minutes for device generation
- Gradle daemon improves subsequent build performance significantly  
- Device generation is I/O bound on network download, then CPU intensive for file generation
# Device Generator Module

This module replaces the bash script functionality with Kotlin code using KotlinPoet to generate device specifications.

## Overview

The `device-generator` module provides a Kotlin-based alternative to `scripts/update-devices.sh`. It fetches device data from external sources and generates:

1. Main `Devices.kt` file with Google device constants
2. Manufacturer extension files (e.g., `SamsungDevices.kt`, `XiaomiDevices.kt`)

## Features

- **Type-safe generation**: Uses KotlinPoet for robust Kotlin code generation
- **External data source**: Fetches latest device specs from Android Device Catalog CSV
- **Duplicate handling**: Automatically deduplicates device specifications
- **Dry run support**: Preview changes before generating files
- **Built-in fallbacks**: Ensures critical Google devices are always available

## Usage

### Generate all device files
```bash
./gradlew :device-generator:run
```

### Dry run (preview only)
```bash  
./gradlew :device-generator:run --args="--dry-run"
```

## Architecture

- `DeviceFetcher`: Downloads and parses device data from external CSV
- `DeviceSpec`: Data model representing a device specification
- `DevicesFileGenerator`: Generates main Devices.kt using KotlinPoet
- `ManufacturerExtensionGenerator`: Generates manufacturer extension files
- `DeviceGenerator`: Main orchestrator class

## Data Sources

Primary source: [Android Device Catalog CSV](https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/refs/heads/main/lib/src/test/resources/android-devices-catalog.csv)

## Output

- **Main file**: `android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/Devices.kt`
- **Extensions**: `android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/devices/*Devices.kt`

## Migration from Bash Script

This module replaces `scripts/update-devices.sh` with equivalent functionality:

| Bash Script | Kotlin Generator |
|-------------|------------------|
| `./scripts/update-devices.sh --dry-run` | `./gradlew :device-generator:run --args="--dry-run"` |
| `./scripts/update-devices.sh` | `./gradlew :device-generator:run` |

The generated output is functionally identical but provides better maintainability and type safety.
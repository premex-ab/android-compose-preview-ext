# Android Compose Preview Extensions

[![Build and Test](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml)
[![Publish to GitHub Packages](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A Kotlin library that extends Android Compose preview capabilities with comprehensive third‑party device specifications (Zebra, Samsung, Honeywell, Datalogic, etc.). Built to work with `androidx.compose.ui:ui-tooling-preview`.

## Migration Notice

The legacy `Devices` object has been renamed to `DeviceCatalog` and all default Google device constants (Nexus / Pixel / Automotive) have been removed. Only manufacturer extension accessors remain (e.g. `DeviceCatalog.Zebra.TC26`). A deprecated typealias `Devices` exists for migration but will be removed in a future major release.

```diff
-import se.premex.compose.preview.Devices
+import se.premex.compose.preview.DeviceCatalog
-
-@Preview(device = Devices.PIXEL_8)
+@Preview(device = DeviceCatalog.Zebra.TC26)
```

## Supported Manufacturers

- **Zebra Technologies** (rugged / enterprise mobile computers)
- **Samsung Galaxy** (selected consumer & enterprise models)
- **Honeywell** (enterprise mobility & data collection)
- **Datalogic** (data capture & industrial devices)

> Google built‑in device IDs are intentionally excluded to keep this catalog focused on extended / enterprise scenarios.

## Installation

### Gradle (Kotlin DSL)
```kotlin
dependencies { implementation("se.premex.compose.preview:android-compose-preview-ext:1.0.0") }
```
### Gradle (Groovy)
```gradle
dependencies { implementation 'se.premex.compose.preview:android-compose-preview-ext:1.0.0' }
```
### Maven
```xml
<dependency>
  <groupId>se.premex.compose.preview</groupId>
  <artifactId>android-compose-preview-ext</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Usage

### Basic Preview
```kotlin
import androidx.compose.ui.tooling.preview.Preview
import se.premex.compose.preview.DeviceCatalog

@Preview(device = DeviceCatalog.Zebra.TC26)
@Preview(device = DeviceCatalog.Samsung.GALAXY_S24)
@Composable
fun MyComposablePreview() { /* ... */ }
```

### Enterprise Focused Examples
```kotlin
@Preview(name = "Zebra TC27 - Warehouse", device = DeviceCatalog.Zebra.TC27)
@Preview(name = "Honeywell CT45 - Retail POS", device = DeviceCatalog.Honeywell.CT45)
@Preview(name = "Datalogic Memor 11 - Logistics", device = DeviceCatalog.Datalogic.MEMOR_11)
@Composable
fun EnterprisePreview() { /* ... */ }
```

### Multi-Device Group
```kotlin
@Preview(device = DeviceCatalog.Zebra.TC57, name = "Zebra TC57")
@Preview(device = DeviceCatalog.Samsung.GALAXY_S24, name = "Galaxy S24")
@Preview(device = DeviceCatalog.Honeywell.CT60, name = "Honeywell CT60")
@Composable
fun MultiDevicePreview() { /* ... */ }
```

## Device Categories (Examples)

### Zebra
```kotlin
DeviceCatalog.Zebra.TC26    // 5" HD, 720x1280, 294 DPI
DeviceCatalog.Zebra.TC27    // 5" FHD, 1080x2160, 402 DPI
DeviceCatalog.Zebra.TC57    // 5" FHD, 1080x1920, 441 DPI
DeviceCatalog.Zebra.TC77    // 4.7" FHD, 1080x1920, 469 DPI
```
### Samsung
```kotlin
DeviceCatalog.Samsung.GALAXY_S24       // 6.2" FHD+
DeviceCatalog.Samsung.GALAXY_S24_ULTRA // 6.8" QHD+
DeviceCatalog.Samsung.GALAXY_TAB_S9    // 11" WQXGA
```
### Honeywell
```kotlin
DeviceCatalog.Honeywell.CT40
DeviceCatalog.Honeywell.CT45
DeviceCatalog.Honeywell.EDA52
```
### Datalogic
```kotlin
DeviceCatalog.Datalogic.MEMOR_10
DeviceCatalog.Datalogic.MEMOR_11
DeviceCatalog.Datalogic.SKORPIO_X5
```

## Specification Format

All third‑party devices use the `spec:` format: `spec:width=720,height=1280,unit=px,dpi=294`.

Fields:
- width / height: pixels
- unit: always `px`
- dpi: density for accurate rendering

## Automated Updates

Weekly & manual workflows keep manufacturer specs up to date. Run locally:
```bash
./gradlew :device-generator:run --args="--dry-run"  # preview
./gradlew :device-generator:run                     # generate
```

## Development
```bash
./gradlew build
./gradlew test
```
Add / update manufacturer specs via the generator; Google devices are intentionally excluded.

## Releases
Tag and push (e.g. `v1.0.1`) then create a GitHub Release; publishing is automated.

## License
MIT License. See [LICENSE](LICENSE).

## Contributing & Support
PRs welcome. Open issues for bugs or device spec corrections. ⭐ Star the repo if it helps you.

# Android Compose Preview Extensions

[![Build and Test](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml)
[![Publish to GitHub Packages](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Super‑charge your Jetpack Compose previews with production‑grade device specs for rugged enterprise handhelds and popular Android OEM devices – Zebra, Honeywell, Datalogic, Samsung, and more – plus Google reference devices through their stable IDs.

> Stop eyeballing layouts on a single Pixel. Catch density, width/height & aspect issues instantly – before they ship.

<!-- SUPPORTED_DEVICE_STATS_START -->
Total devices: **24282** across **2668** manufacturers. See the full list: [Supported Devices](docs/devices/README.md).
<!-- SUPPORTED_DEVICE_STATS_END -->

## Why this exists
The built‑in Compose preview device list is limited and focused on consumer phones. Enterprise & vertical‑market apps often run on purpose‑built scanners, sleds and rugged handhelds with very different screen metrics. This library ships curated, de‑duplicated specs so you can preview realistically with a single import.

## Key Features
- One Kotlin object per manufacturer (e.g. `Zebra`, `Honeywell`, `Samsung`)
- Simple constant strings drop straight into `@Preview(device = Zebra.MC33)` style usage
- Google devices use official `id:` previews; others use explicit `spec:width=...,height=...,dpi=...` strings
- Automatic markdown catalog generation: browse all supported devices in [docs/devices](docs/devices/README.md)
- Deterministic naming with conflict resolution (resolution / DPI / short hash fallbacks)
- Regenerate & extend via a Kotlin generator module (no shell scripts)

## Quick Start
Add the GitHub Packages repository (if you haven't globally) and the dependency:

```kotlin
// settings.gradle.kts or build.gradle.kts (top-level repositories block)
repositories {
    mavenCentral()
    google()
    maven {
        url = uri("https://maven.pkg.github.com/premex-ab/android-compose-preview-ext")
        credentials {
            username = extra["gpr.user"].toString()
            password = extra["gpr.key"].toString()
        }
    }
}
```

```kotlin
// Module build.gradle.kts
dependencies {
    implementation("se.premex.compose.preview:android-compose-preview-ext:1.0.0")
}
```

Provide `gpr.user` / `gpr.key` through `gradle.properties` or environment variables (`USERNAME` / `TOKEN`).

## Usage
Import the manufacturer object you need and reference a constant:

```kotlin
import androidx.compose.ui.tooling.preview.Preview
import se.premex.compose.preview.device.catalog.android.Zebra

@Preview(name = "Zebra MC33", device = Zebra.MC33)
@Composable
fun ZebraPreview() { /* ... */ }
```

Multiple devices in one file:

```kotlin
@Preview(name = "Rugged (MC33)", device = Zebra.MC33)
@Preview(name = "Rugged (EC50)", device = Zebra.EC50)
@Preview(name = "Scanner (CK65)", device = Honeywell.CK65)
@Composable
fun MultiDevicePreview() { /* ... */ }
```

Google reference devices (Pixels etc.) use their `id:` values automatically in constants, so you still write:

```kotlin
@Preview(name = "Pixel 8", device = Google.PIXEL_8)
```

## Supported Devices
A regenerated catalog lives here: [docs/devices/README.md](docs/devices/README.md). (If the link is empty, run the generator locally.)

## Regenerating / Contributing New Devices
The `device-generator` module fetches & normalizes specs, then outputs:
- Kotlin sources under `android-compose-preview-ext/src/main/kotlin/se/premex/compose/preview/device/catalog/android/`
- Markdown docs under `docs/devices/`
- Updated stats block in this README (between markers)

Run:
```bash
./gradlew :device-generator:run
```
Commit the changed Kotlin & Markdown files.

### Adding / fixing a device
1. Locate the fetch logic inside `device-generator` (e.g. `DeviceFetcher`) and extend its source lists.
2. Run the generator.
3. Verify new constants & docs.
4. Open a PR describing the source/reference for the spec (link to vendor PDF / site preferred).

## Versioning & Stability
Constant names are derived from vendor model codes. If a conflict occurs (same code, different resolution) a suffix (resolution, DPI or short hash) is appended. This keeps existing names stable for the common case.

## License
MIT – see [LICENSE](LICENSE).

## Credits
Maintained by [Premex AB](https://premex.se). Vendor names & trademarks belong to their respective owners.

---
Enjoy faster feedback loops? Star the repo so others can discover it ⭐

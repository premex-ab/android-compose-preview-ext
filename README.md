# Android Compose Preview Extensions

[![Build and Test](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/ci.yml)
[![Publish to GitHub Packages](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml/badge.svg)](https://github.com/premex-ab/android-compose-preview-ext/actions/workflows/publish.yml)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A Kotlin library that extends Android Compose preview capabilities with comprehensive device specifications from major manufacturers, designed to work seamlessly with `androidx.compose.ui:ui-tooling-preview` and `androidx.compose.ui:ui-tooling-preview-android`.

## 📱 Supported Devices

This library provides device specifications for:

- **Google Devices**: All Nexus and Pixel devices (25+ devices)
- **Zebra Technologies**: Professional mobile computers and rugged devices (17+ models)
- **Samsung Galaxy**: Popular consumer and enterprise devices (11+ models) 
- **Honeywell**: Enterprise mobility and data collection devices (10+ models)
- **Datalogic**: Professional data capture and industrial automation devices (7+ models)

## 🚀 Installation

### Gradle (Kotlin DSL)

```kotlin
dependencies {
    implementation("com.premex.compose.preview:android-compose-preview-ext:1.0.0")
}
```

### Gradle (Groovy)

```gradle
dependencies {
    implementation 'com.premex.compose.preview:android-compose-preview-ext:1.0.0'
}
```

### Maven

```xml
<dependency>
    <groupId>com.premex.compose.preview</groupId>
    <artifactId>android-compose-preview-ext</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 💻 Usage

### Basic Usage

Use the device specifications directly in your `@Preview` annotations:

```kotlin
import androidx.compose.ui.tooling.preview.Preview
import com.premex.compose.preview.Devices

@Preview(device = Devices.PIXEL_8)
@Preview(device = Devices.Zebra.TC26) 
@Preview(device = Devices.Samsung.GALAXY_S24)
@Composable
fun MyComposablePreview() {
    MyComposable()
}
```

### Enterprise Device Examples

Perfect for enterprise and industrial applications:

```kotlin
@Preview(
    name = "Zebra TC27 - Warehouse Scanner",
    device = Devices.Zebra.TC27
)
@Preview(
    name = "Honeywell CT45 - Retail POS",
    device = Devices.Honeywell.CT45
)
@Preview(
    name = "Datalogic Memor 11 - Logistics",
    device = Devices.Datalogic.MEMOR_11
)
@Composable
fun EnterpriseAppPreview() {
    EnterpriseApp()
}
```

### Multi-Device Preview Groups

Create comprehensive preview groups for different use cases:

```kotlin
@Preview(device = Devices.PIXEL_8, name = "Consumer - Pixel 8")
@Preview(device = Devices.Samsung.GALAXY_S24, name = "Consumer - Galaxy S24")
@Preview(device = Devices.Zebra.TC57, name = "Enterprise - Zebra TC57")
@Preview(device = Devices.Honeywell.CT60, name = "Enterprise - Honeywell CT60")
@Composable
fun UniversalAppPreview() {
    MyUniversalApp()
}
```

## 📋 Device Categories

### Google Devices
All standard Google devices are included:
- Nexus series (Nexus 5, 6, 7, 9, 10, 5X, 6P)
- Pixel series (Pixel, Pixel 2-9, Pro, XL, Fold, Tablet)
- Automotive displays

### Enterprise Devices

#### Zebra Technologies
Professional mobile computers and rugged devices:
```kotlin
Devices.Zebra.TC26    // 5" HD, 720x1280, 294 DPI
Devices.Zebra.TC27    // 5" FHD, 1080x2160, 402 DPI  
Devices.Zebra.TC57    // 5" FHD, 1080x1920, 441 DPI
Devices.Zebra.TC77    // 4.7" FHD, 1080x1920, 469 DPI
// ... and more
```

#### Samsung Galaxy
Consumer and enterprise devices:
```kotlin
Devices.Samsung.GALAXY_S24        // 6.2" FHD+, 1080x2340, 416 DPI
Devices.Samsung.GALAXY_S24_ULTRA  // 6.8" QHD+, 1440x3120, 505 DPI
Devices.Samsung.GALAXY_TAB_S9     // 11" WQXGA, 1600x2560, 274 DPI
// ... and more
```

#### Honeywell
Enterprise mobility and data collection:
```kotlin
Devices.Honeywell.CT40    // 5" HD, 720x1280, 294 DPI
Devices.Honeywell.CT45    // 5" HD, 720x1280, 294 DPI
Devices.Honeywell.EDA52   // 5" HD, 720x1280, 294 DPI
// ... and more
```

#### Datalogic
Professional data capture and automation:
```kotlin
Devices.Datalogic.MEMOR_10     // 5" HD, 720x1280, 294 DPI
Devices.Datalogic.MEMOR_11     // 5" FHD, 1080x1920, 441 DPI
Devices.Datalogic.SKORPIO_X5   // 3.2" WVGA, 800x480, 216 DPI
// ... and more
```

## 🛠 Device Specification Format

This library uses Android's device specification format:

- **Google devices**: Use `id:` format (e.g., `"id:pixel_8"`)
- **Third-party devices**: Use `spec:` format (e.g., `"spec:width=720,height=1280,unit=px,dpi=294"`)

The spec format allows precise control over:
- **Width/Height**: Screen dimensions in pixels
- **Unit**: Always `px` for pixels
- **DPI**: Dots per inch for accurate rendering

## 🔄 Automated Updates

This library includes automated device specification updates:

### Weekly Updates
- Runs every Sunday at 6:00 UTC
- Automatically checks for new device specifications
- Creates pull requests with updates

### Manual Updates
You can trigger updates manually:
1. Go to the [Actions tab](https://github.com/premex-ab/android-compose-preview-ext/actions)
2. Select "Update Device Specifications"
3. Click "Run workflow"

### Local Updates
Run the update script locally:
```bash
# Show what would be updated
./scripts/update-devices.sh --dry-run

# Run the update
./scripts/update-devices.sh

# Force update without validation  
./scripts/update-devices.sh --force
```

## 🌐 Curated External Device Sources (Maintainer Managed)

Third-party device specifications are enriched using a small set of vetted, version-controlled external JSON catalogs referenced in:
```
scripts/curated-sources.json
```
Consumers do not configure URLs. Maintainers update this file when adding or revising external catalogs. The update script fetches each source, normalizes heterogeneous field names, deduplicates, and merges them with locally maintained authoritative JSON specs found in `scripts/local-sources/*.json` (local sources take precedence when duplicates occur by manufacturer+code).

### Current Curated Sources
(See `scripts/curated-sources.json` for the up-to-date list.) Example entry:
```json
{
  "sources": [
    {
      "name": "Android Device Catalog (minimal subset)",
      "url": "https://raw.githubusercontent.com/hossain-khan/android-device-catalog-parser/main/lib/src/test/resources/android-devices-catalog-min.json",
      "format": "catalog_min"
    }
  ]
}
```

### Accepted JSON Shapes (auto-detected)
The parser recognizes objects under any of these keys or root arrays:
- `devices[]`, root `[]`, `deviceList[]`, `supportedDevices[]`
It maps common field aliases:
- Manufacturer: `manufacturer`, `brand`, `oem`, `vendor`
- Code / model: `code`, `id`, `identifier`, `model`, `name`
- Width: `width`, `widthPx`, `screenWidthPx`, `screenX`, `screen_width`
- Height: `height`, `heightPx`, `screenHeightPx`, `screenY`, `screen_height`
- Density / DPI: `dpi`, `density`, `screenDensity`, `screen_density`, `ppi`
Missing manufacturer defaults to `Generic`; missing code is synthesized: `UNNAMED_<WxH>_<DPI>DPI`.

### Normalization Rules
- Constant names are converted to SCREAMING_SNAKE_CASE (non-alphanumerics become `_`).
- First occurrence of a (manufacturer, code) pair wins (later duplicates skipped).
- Portrait orientation expected for width/height (natural device orientation).

### Running the Aggregation
```bash
./scripts/update-devices.sh --dry-run   # Show counts
./scripts/update-devices.sh            # Regenerate Devices.kt
```
The script ensures required test devices remain present even if a remote source omits them.

### Adding / Updating Sources (Maintainers Only)
1. Edit `scripts/curated-sources.json` (add new `{"name","url","format"}` entry).
2. Run the update script locally and verify diff + tests.
3. Commit both the curated sources file change and regenerated `Devices.kt`.

### Rationale
Centralizing sources avoids user-side configuration drift and guarantees reproducible device lists across environments and CI.

### Validation & Safety
- Soft-fails on unreachable remote sources (continues with whatever was aggregated so far).
- Skips entries with non-numeric width/height/dpi (or computes dpi if diagonal provided).
- Ignores incomplete records missing width/height/dpi (and no diagonal).
- Does not execute remote code—pure JSON ingestion.

---

## 🏗 Development

### Building the Project

```bash
# Build the library
./gradlew build

# Run tests
./gradlew test

# Generate documentation
./gradlew dokkaHtml
```

### Contributing

1. Fork the repository
2. Create a feature branch
3. Add your device specifications
4. Run tests: `./gradlew test`
5. Submit a pull request

### Adding New Devices

Add or update JSON entries instead of modifying script-internal arrays (arrays removed):

1. For authoritative/internal devices (e.g. rugged / enterprise): edit or add a file in `scripts/local-sources/` (one JSON per manufacturer recommended). Schema:
   ```json
   {
     "devices": [
       { "manufacturer": "Acme", "code": "ACME_PRO_X", "width": 1080, "height": 2400, "dpi": 420 }
     ]
   }
   ```
2. For publicly sourced devices you still trust: add a new entry to `scripts/curated-sources.json` (remote URL).
3. Run:
   ```bash
   ./scripts/update-devices.sh --dry-run
   ./scripts/update-devices.sh
   ./gradlew test
   ```
4. Commit the updated JSON plus regenerated `Devices.kt`.

Guidelines:
- Use natural portrait pixel dimensions.
- Supply integer DPI; if only diagonal size is known the script will compute DPI.
- Use SCREAMING_SNAKE_CASE for `code`; uniqueness per manufacturer.
- Avoid duplicates: first occurrence (local overrides remote) is kept.

## 📦 Releases

This library uses automated releases via GitHub Actions:

### Creating a Release
1. Create and push a git tag: `git tag v1.0.1 && git push origin v1.0.1`
2. Create a GitHub release from the tag
3. The library will be automatically published to GitHub Packages

### Manual Publishing
You can also publish manually using the workflow dispatch:
1. Go to Actions → "Publish to GitHub Packages"
2. Click "Run workflow"
3. Enter the version number

## 🎯 Use Cases

This library is perfect for:

- **Enterprise Applications**: Preview on actual devices used in warehouses, retail, healthcare
- **Consumer Applications**: Test on popular Samsung Galaxy and Google Pixel devices  
- **Cross-Platform Testing**: Ensure UI works across different screen sizes and densities
- **Device-Specific Development**: Optimize for specific hardware configurations

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

## 🐛 Issues

If you encounter any issues or have suggestions for improvements, please [create an issue](https://github.com/premex-ab/android-compose-preview-ext/issues).

## ⭐ Support

If you find this library useful, please consider giving it a star on GitHub!

---

**Made with ❤️ for the Android development community**
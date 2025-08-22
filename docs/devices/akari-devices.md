# AKARI Devices

This document lists all Akari device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Akari
- **Usage**: `Devices.Akari.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Akari.DV8035)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DV8219`** - Dv8219 | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DV8035`** - Dv8035 | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

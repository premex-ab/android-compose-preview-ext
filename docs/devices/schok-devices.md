# SCHOK Devices

This document lists all Schok device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Schok
- **Usage**: `Devices.Schok.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Schok.FREEDOM_TURBO_XL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`FREEDOM_TURBO_XL`** - Freedom Turbo Xl | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SV55216`** - Sv55216 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SFT5216`** - Sft5216 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`SV67Q`** - Sv67q | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# SEGO Devices

This document lists all Sego device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Sego
- **Usage**: `Devices.Sego.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sego.S24)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`ZERO_50`** - Zero 50 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`S24`** - S24 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`S25_NEO`** - S25 Neo | **DPI**: 272
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=272
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`S_PAD`** - S Pad | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

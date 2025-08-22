# ASCOM Devices

This document lists all Ascom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Ascom
- **Usage**: `Devices.Ascom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ascom.ABAA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`ABAA`** - Abaa | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`ABBA`** - Abba | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`ACBA`** - Acba | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`ADAA`** - Adaa | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`SH4_1`** - Sh4 1 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=440
  ```

- **`SH4_2`** - Sh4 2 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=440
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

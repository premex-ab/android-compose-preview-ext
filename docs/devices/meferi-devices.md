# MEFERI Devices

This document lists all Meferi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Meferi
- **Usage**: `Devices.Meferi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Meferi.ME10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`ME10`** - Me10 | **DPI**: 200
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=200
  ```

- **`ME40K`** - Me40k | **DPI**: 200
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=200
  ```

- **`ME74`** - Me74 | **DPI**: 210
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=210
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`ME61`** - Me61 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

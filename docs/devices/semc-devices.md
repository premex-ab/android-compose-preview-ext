# SEMC Devices

This document lists all Semc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Semc
- **Usage**: `Devices.Semc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Semc.LT22I)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 320x480 (Micro)

**Screen specs**: 320x480px | **Aspect ratio**: 2:3

- **`ST27I`** - St27i | **DPI**: 160
  ```kotlin
  spec:width=320,height=480,unit=px,dpi=160
  ```

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`LT22I`** - Lt22i | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`LT26I`** - Lt26i | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`LT26II`** - Lt26ii | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`LT26W`** - Lt26w | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`LT28H`** - Lt28h | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

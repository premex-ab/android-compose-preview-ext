# DIGICEL Devices

This document lists all Digicel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Digicel
- **Usage**: `Devices.Digicel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Digicel.DL3PLUSPRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`DL4S_TC`** - Dl4s Tc | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

- **`DL5_PRO`** - Dl5 Pro | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`DL4_2022`** - Dl4 2022 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`DL3PLUSPRO`** - Dl3pluspro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`DL4_PLUS`** - Dl4 Plus | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# ZATEC Devices

This document lists all Zatec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Zatec
- **Usage**: `Devices.Zatec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zatec.JOY)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`WIND`** - Wind | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`ZATEC_ZPOWER_2018`** - Zatec Zpower 2018 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 480x996 (Medium)

**Screen specs**: 480x996px | **Aspect ratio**: 40:83

- **`JOY`** - Joy | **DPI**: 240
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=240
  ```

- **`JOY_PLUS`** - Joy Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`ZPAD_1`** - Zpad 1 | **DPI**: 213
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

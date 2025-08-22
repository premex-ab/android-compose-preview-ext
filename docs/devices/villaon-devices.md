# VILLAON Devices

This document lists all Villaon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: Villaon
- **Usage**: `Devices.Villaon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Villaon.V20)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`V20`** - V20 | **DPI**: 200
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=200
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`VILLAON_V20_SE`** - Villaon V20 Se | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 540x1200 (Large)

**Screen specs**: 540x1200px | **Aspect ratio**: 9:20

- **`VILLAON_V30`** - Villaon V30 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1200,unit=px,dpi=240
  ```

### 576x1280 (Large)

**Screen specs**: 576x1280px | **Aspect ratio**: 9:20

- **`VILLAON_V40`** - Villaon V40 | **DPI**: 240
  ```kotlin
  spec:width=576,height=1280,unit=px,dpi=240
  ```

- **`VILLAON_V652L`** - Villaon V652l | **DPI**: 240
  ```kotlin
  spec:width=576,height=1280,unit=px,dpi=240
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`VILLAON_V30_RS`** - Villaon V30 Rs | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`VILLAON_V40S`** - Villaon V40s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

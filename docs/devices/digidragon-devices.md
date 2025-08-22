# DIGIDRAGON Devices

This document lists all Digidragon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Digidragon
- **Usage**: `Devices.Digidragon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Digidragon.DS502)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`DS6261`** - Ds6261 | **DPI**: 220
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=220
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`DS502`** - Ds502 | **DPI**: 220
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=220
  ```

### 540x1140 (Large)

**Screen specs**: 540x1140px | **Aspect ratio**: 9:19

- **`DS571`** - Ds571 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1140,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`_708Z`** -  708z | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`DS6018`** - Ds6018 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

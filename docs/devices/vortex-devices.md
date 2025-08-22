# VORTEX Devices

This document lists all Vortex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Vortex
- **Usage**: `Devices.Vortex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vortex.BTAB10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`SYNQ`** - Synq | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`VORTEXV20`** - Vortexv20 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`CM62`** - Cm62 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=280
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`PG65`** - Pg65 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`VORTEX_HD65_CHOICE`** - Vortex Hd65 Choice | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BTAB10`** - Btab10 | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

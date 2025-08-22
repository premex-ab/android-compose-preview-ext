# SICO Devices

This document lists all Sico device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Sico
- **Usage**: `Devices.Sico.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sico.DIAMOND_2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MORE_3`** - More 3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`PLUS2`** - Plus2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`PLUS3_4G`** - Plus3 4g | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`SICO_EXPRESS3`** - Sico Express3 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DIAMOND_2`** - Diamond 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`TOPAZ`** - Topaz | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MEGA2`** - Mega2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`MEGA2MAX`** - Mega2max | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`NILE_X`** - Nile X | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

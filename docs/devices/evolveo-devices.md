# EVOLVEO Devices

This document lists all Evolveo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Evolveo
- **Usage**: `Devices.Evolveo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Evolveo.EVOLVEOG2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`EVOLVEOG2`** - Evolveog2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`EVOLVEOG4`** - Evolveog4 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`EVOLVEOG8`** - Evolveog8 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`STRONGPHONEG5`** - Strongphoneg5 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`STRONGPHONE_G7`** - Strongphone G7 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`STRONGPHONE_G9`** - Strongphone G9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

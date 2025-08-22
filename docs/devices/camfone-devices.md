# CAMFONE Devices

This document lists all Camfone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Camfone
- **Usage**: `Devices.Camfone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Camfone.HERO_13)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 240x282 (Micro)

**Screen specs**: 240x282px | **Aspect ratio**: 40:47

- **`HERO_13`** - Hero 13 | **DPI**: 120
  ```kotlin
  spec:width=240,height=282,unit=px,dpi=120
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`HONEY_Y2S`** - Honey Y2s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# MIONE Devices

This document lists all Mione device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Mione
- **Usage**: `Devices.Mione.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mione.MIONEI)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`M_701PLUS`** - M 701plus | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`MIONEI`** - Mionei | **DPI**: 240
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=240
  ```

- **`MIONE_S20`** - Mione S20 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MIONE_PRO_PLUS`** - Mione Pro Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

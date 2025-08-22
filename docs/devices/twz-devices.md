# TWZ Devices

This document lists all Twz device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Twz
- **Usage**: `Devices.Twz.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Twz.OX_X1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 240x296 (Micro)

**Screen specs**: 240x296px | **Aspect ratio**: 30:37

- **`OX_X1`** - Ox X1 | **DPI**: 120
  ```kotlin
  spec:width=240,height=296,unit=px,dpi=120
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`V6`** - V6 | **DPI**: 204
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=204
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`V10`** - V10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

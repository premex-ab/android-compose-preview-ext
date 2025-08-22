# KAPSYS Devices

This document lists all Kapsys device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Kapsys
- **Usage**: `Devices.Kapsys.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kapsys.R889)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`R889`** - R889 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 640x960 (Medium)

**Screen specs**: 640x960px | **Aspect ratio**: 2:3

- **`SMARTVISION3`** - Smartvision3 | **DPI**: 260
  ```kotlin
  spec:width=640,height=960,unit=px,dpi=260
  ```

- **`SMARTVISION3US`** - Smartvision3us | **DPI**: 260
  ```kotlin
  spec:width=640,height=960,unit=px,dpi=260
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

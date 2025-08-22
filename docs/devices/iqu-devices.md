# IQU Devices

This document lists all Iqu device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Iqu
- **Usage**: `Devices.Iqu.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Iqu.IQUSMARTEASYT10W)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SMARTEASY_Q50`** - Smarteasy Q50 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`IQUSMARTEASYT10W`** - Iqusmarteasyt10w | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`IQUSMARTEASYT8W`** - Iqusmarteasyt8w | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

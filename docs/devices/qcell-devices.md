# QCELL Devices

This document lists all Qcell device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Qcell
- **Usage**: `Devices.Qcell.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Qcell.QSMART)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`QSMART`** - Qsmart | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`QSMART_PLUS`** - Qsmart Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

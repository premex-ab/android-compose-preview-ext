# ATEC Devices

This document lists all Atec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Atec
- **Usage**: `Devices.Atec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Atec.APD3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`APD3`** - Apd3 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=320
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`ATEC_IWB`** - Atec Iwb | **DPI**: 420
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=420
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

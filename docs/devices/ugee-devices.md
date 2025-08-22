# UGEE Devices

This document lists all Ugee device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ugee
- **Usage**: `Devices.Ugee.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ugee.HERA_VIS_WIFI)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`UGEEUT1LITE_EEA`** - Ugeeut1lite Eea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

- **`UGEEUT1LITE_NOEEA`** - Ugeeut1lite Noeea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 1600x2400 (XXL)

**Screen specs**: 1600x2400px | **Aspect ratio**: 2:3

- **`HERA_VIS_WIFI`** - Hera Vis Wifi | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2400,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

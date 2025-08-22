# EKINOX Devices

This document lists all Ekinox device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ekinox
- **Usage**: `Devices.Ekinox.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ekinox.E6)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 540x1132 (Large)

**Screen specs**: 540x1132px | **Aspect ratio**: 135:283

- **`K5`** - K5 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1132,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`E6`** - E6 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

- **`E8_ULTRA`** - E8 Ultra | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

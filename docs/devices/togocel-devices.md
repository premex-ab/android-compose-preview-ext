# TOGOCEL Devices

This document lists all Togocel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Togocel
- **Usage**: `Devices.Togocel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Togocel.S63)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`TOGOCEL_F1_MAX_4G`** - Togocel F1 Max 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`S63`** - S63 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

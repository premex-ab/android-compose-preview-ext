# IMIN Devices

This document lists all Imin device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Imin
- **Usage**: `Devices.Imin.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Imin.SWAN1PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SWAN1PRO`** - Swan1pro | **DPI**: 220
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=220
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`SWIFT2PRO`** - Swift2pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

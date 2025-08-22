# VIZIO Devices

This document lists all Vizio device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Vizio
- **Usage**: `Devices.Vizio.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vizio.XR6M10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`XR6P10`** - Xr6p10 | **DPI**: 400
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=400
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`XR6M10`** - Xr6m10 | **DPI**: 240
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

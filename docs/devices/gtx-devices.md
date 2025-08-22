# GTX Devices

This document lists all Gtx device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Gtx
- **Usage**: `Devices.Gtx.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gtx.GTX_JACULUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`JACULUS_V2`** - Jaculus V2 | **DPI**: 260
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=260
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`GTX_JACULUS`** - Gtx Jaculus | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`GTX_JACULUS_01`** - Gtx Jaculus 01 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# CTRONIQ Devices

This document lists all Ctroniq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ctroniq
- **Usage**: `Devices.Ctroniq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ctroniq.CTRONIQ_SNOOK_X10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`CTRONIQ_SNOOK_X10`** - Ctroniq Snook X10 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`CTRONIQ_SNOOK_X10L`** - Ctroniq Snook X10l | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`_4G_TABLET`** -  4g Tablet | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# IIYAMA Devices

This document lists all Iiyama device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Iiyama
- **Usage**: `Devices.Iiyama.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Iiyama.RK3588_T)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`RK3588_T`** - Rk3588 T | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`TEXX13A`** - Texx13a | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# EJBOARD Devices

This document lists all Ejboard device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ejboard
- **Usage**: `Devices.Ejboard.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ejboard.RK3588_T)
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

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

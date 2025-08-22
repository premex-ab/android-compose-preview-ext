# AHA Devices

This document lists all Aha device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Aha
- **Usage**: `Devices.Aha.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Aha.AHA_ULTRA_RK3588)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`AHA_ULTRA_RK3588`** - Aha Ultra Rk3588 | **DPI**: 420
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=420
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

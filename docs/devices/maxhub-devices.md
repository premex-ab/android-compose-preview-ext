# MAXHUB Devices

This document lists all Maxhub device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Maxhub
- **Usage**: `Devices.Maxhub.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Maxhub.E3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`E3`** - E3 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`RK3588_T`** - Rk3588 T | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

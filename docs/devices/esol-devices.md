# ESOL Devices

This document lists all Esol device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Esol
- **Usage**: `Devices.Esol.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Esol.INTERACTIVE_WHITE_BOARD)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`INTERACTIVE_WHITE_BOARD`** - Interactive White Board | **DPI**: 640
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=640
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

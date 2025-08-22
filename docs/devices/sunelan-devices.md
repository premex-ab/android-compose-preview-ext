# SUNELAN Devices

This document lists all Sunelan device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Sunelan
- **Usage**: `Devices.Sunelan.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sunelan.MOUNTAIN_M8)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`RIVER_X1`** - River X1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`RIVER_X3`** - River X3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`MOUNTAIN_M8`** - Mountain M8 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

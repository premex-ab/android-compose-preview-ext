# FLUO Devices

This document lists all Fluo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Fluo
- **Usage**: `Devices.Fluo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fluo.N)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1498 (XL)

**Screen specs**: 720x1498px | **Aspect ratio**: 360:749

- **`N`** - N | **DPI**: 320
  ```kotlin
  spec:width=720,height=1498,unit=px,dpi=320
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`X2_MAX`** - X2 Max | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

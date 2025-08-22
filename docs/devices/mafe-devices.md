# MAFE Devices

This document lists all Mafe device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mafe
- **Usage**: `Devices.Mafe.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mafe.V9)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`Z2`** - Z2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`V9`** - V9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

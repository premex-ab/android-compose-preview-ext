# SHIFT Devices

This document lists all Shift device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Shift
- **Usage**: `Devices.Shift.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Shift.AXOLOTL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SHIFT6M`** - Shift6m | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`AXOLOTL`** - Axolotl | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=420
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`OTTER`** - Otter | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=420
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

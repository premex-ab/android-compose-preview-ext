# ECOM Devices

This document lists all Ecom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ecom
- **Usage**: `Devices.Ecom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ecom.EX_HANDY10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 320x432 (Micro)

**Screen specs**: 320x432px | **Aspect ratio**: 20:27

- **`EX_HANDY10`** - Ex Handy10 | **DPI**: 160
  ```kotlin
  spec:width=320,height=432,unit=px,dpi=160
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SMART_EX02`** - Smart Ex02 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

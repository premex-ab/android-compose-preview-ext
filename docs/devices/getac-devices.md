# GETAC Devices

This document lists all Getac device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Getac
- **Usage**: `Devices.Getac.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Getac.ZX10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`ZX10`** - Zx10 | **DPI**: 260
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=260
  ```

- **`ZX80`** - Zx80 | **DPI**: 260
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=260
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`ZX70`** - Zx70 | **DPI**: 160
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=160
  ```

- **`ZX70G2`** - Zx70g2 | **DPI**: 240
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

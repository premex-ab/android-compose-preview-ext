# SNT Devices

This document lists all Snt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Snt
- **Usage**: `Devices.Snt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Snt.C20)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`C20`** - C20 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`_8788_7`** -  8788 7 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

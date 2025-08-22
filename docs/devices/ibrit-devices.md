# IBRIT Devices

This document lists all Ibrit device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ibrit
- **Usage**: `Devices.Ibrit.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ibrit.MAX10_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`Z2`** - Z2 | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MAX10_1`** - Max10 1 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

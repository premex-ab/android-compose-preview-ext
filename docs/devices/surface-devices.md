# SURFACE Devices

This document lists all Surface device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Surface
- **Usage**: `Devices.Surface.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Surface.DUO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1344x1892 (XL)

**Screen specs**: 1344x1892px | **Aspect ratio**: 336:473

- **`DUO2`** - Duo2 | **DPI**: 400
  ```kotlin
  spec:width=1344,height=1892,unit=px,dpi=400
  ```

### 1350x1800 (XL)

**Screen specs**: 1350x1800px | **Aspect ratio**: 3:4

- **`DUO`** - Duo | **DPI**: 400
  ```kotlin
  spec:width=1350,height=1800,unit=px,dpi=400
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# VIDA Devices

This document lists all Vida device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Vida
- **Usage**: `Devices.Vida.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vida.S63PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`VIDA_I501`** - Vida I501 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=300
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`S63PLUS`** - S63plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# HUION Devices

This document lists all Huion device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Huion
- **Usage**: `Devices.Huion.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Huion.KT1101)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`KT1101`** - Kt1101 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1600x2176 (XXL)

**Screen specs**: 1600x2176px | **Aspect ratio**: 25:34

- **`KT1201`** - Kt1201 | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2176,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

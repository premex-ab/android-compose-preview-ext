# REGZA Devices

This document lists all Regza device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Regza
- **Usage**: `Devices.Regza.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Regza.HENGSHAN)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`YYT`** - Yyt | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`HENGSHAN`** - Hengshan | **DPI**: 320
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

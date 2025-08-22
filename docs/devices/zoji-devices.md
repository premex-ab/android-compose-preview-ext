# ZOJI Devices

This document lists all Zoji device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Zoji
- **Usage**: `Devices.Zoji.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zoji.Z33)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`Z8`** - Z8 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`Z9`** - Z9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1512 (XL)

**Screen specs**: 720x1512px | **Aspect ratio**: 10:21

- **`Z33`** - Z33 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1512,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# XTR Devices

This document lists all Xtr device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Xtr
- **Usage**: `Devices.Xtr.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xtr.T4)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 320x385 (Micro)

**Screen specs**: 320x385px | **Aspect ratio**: 64:77

- **`Z5`** - Z5 | **DPI**: 160
  ```kotlin
  spec:width=320,height=385,unit=px,dpi=160
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`T4`** - T4 | **DPI**: 213
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

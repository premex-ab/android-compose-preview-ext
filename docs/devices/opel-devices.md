# OPEL Devices

This document lists all Opel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Opel
- **Usage**: `Devices.Opel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Opel.SMARTJ5_M)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 540x960 (Medium)

**Screen specs**: 540x960px | **Aspect ratio**: 9:16

- **`SMARTJ5_M`** - Smartj5 M | **DPI**: 240
  ```kotlin
  spec:width=540,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`SMARTKIDS`** - Smartkids | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

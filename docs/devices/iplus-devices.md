# IPLUS Devices

This document lists all Iplus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Iplus
- **Usage**: `Devices.Iplus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Iplus.IPLUS_P1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 540x1200 (Large)

**Screen specs**: 540x1200px | **Aspect ratio**: 9:20

- **`IPLUS_P3`** - Iplus P3 | **DPI**: 240
  ```kotlin
  spec:width=540,height=1200,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`IPLUS_P1`** - Iplus P1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

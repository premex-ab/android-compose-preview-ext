# KAICOM Devices

This document lists all Kaicom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Kaicom
- **Usage**: `Devices.Kaicom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Kaicom.K901)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 640x1136 (Large)

**Screen specs**: 640x1136px | **Aspect ratio**: 40:71

- **`W660`** - W660 | **DPI**: 320
  ```kotlin
  spec:width=640,height=1136,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`K901`** - K901 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`K901_2`** - K901 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

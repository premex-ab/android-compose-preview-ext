# IQT Devices

This document lists all Iqt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Iqt
- **Usage**: `Devices.Iqt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Iqt.IQT_N8)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2280 (XXL)

**Screen specs**: 1080x2280px | **Aspect ratio**: 9:19

- **`IQT_N8`** - Iqt N8 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2280,unit=px,dpi=480
  ```

### 480x996 (Medium)

**Screen specs**: 480x996px | **Aspect ratio**: 40:83

- **`N6`** - N6 | **DPI**: 240
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`N3`** - N3 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

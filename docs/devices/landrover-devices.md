# LANDROVER Devices

This document lists all Landrover device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Landrover
- **Usage**: `Devices.Landrover.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Landrover.LREXPLORE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`LREXPLORE`** - Lrexplore | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`LREXPLORER`** - Lrexplorer | **DPI**: 280
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

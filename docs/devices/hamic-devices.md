# HAMIC Devices

This document lists all Hamic device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hamic
- **Usage**: `Devices.Hamic.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hamic.MIELS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x640 (Small)

**Screen specs**: 480x640px | **Aspect ratio**: 3:4

- **`POCKET`** - Pocket | **DPI**: 190
  ```kotlin
  spec:width=480,height=640,unit=px,dpi=190
  ```

### 540x1080 (Medium)

**Screen specs**: 540x1080px | **Aspect ratio**: 1:2

- **`MIELS`** - Miels | **DPI**: 260
  ```kotlin
  spec:width=540,height=1080,unit=px,dpi=260
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

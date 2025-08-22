# BERGSTROM Devices

This document lists all Bergstrom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Bergstrom
- **Usage**: `Devices.Bergstrom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bergstrom.H634_BLK)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`H634_BLK`** - H634 Blk | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`P187`** - P187 | **DPI**: 360
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=360
  ```

- **`_666770`** -  666770 | **DPI**: 360
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=360
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

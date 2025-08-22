# AVA Devices

This document lists all Ava device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Ava
- **Usage**: `Devices.Ava.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ava.AVA_RM_RX1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1170 (Large)

**Screen specs**: 480x1170px | **Aspect ratio**: 16:39

- **`AVA_RM_RX1`** - Ava Rm Rx1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=1170,unit=px,dpi=240
  ```

### 540x1080 (Medium)

**Screen specs**: 540x1080px | **Aspect ratio**: 1:2

- **`AVA_RM_RX2_US`** - Ava Rm Rx2 Us | **DPI**: 260
  ```kotlin
  spec:width=540,height=1080,unit=px,dpi=260
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

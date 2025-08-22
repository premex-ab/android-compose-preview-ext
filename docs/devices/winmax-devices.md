# WINMAX Devices

This document lists all Winmax device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Winmax
- **Usage**: `Devices.Winmax.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Winmax.TIGER_X12)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 320x385 (Micro)

**Screen specs**: 320x385px | **Aspect ratio**: 64:77

- **`TIGER_X12`** - Tiger X12 | **DPI**: 160
  ```kotlin
  spec:width=320,height=385,unit=px,dpi=160
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`TIGER_X7`** - Tiger X7 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

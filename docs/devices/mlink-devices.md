# MLINK Devices

This document lists all Mlink device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mlink
- **Usage**: `Devices.Mlink.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mlink.M6501B)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 540x1200 (Large)

**Screen specs**: 540x1200px | **Aspect ratio**: 9:20

- **`M6501B`** - M6501b | **DPI**: 240
  ```kotlin
  spec:width=540,height=1200,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`M761`** - M761 | **DPI**: 260
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=260
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

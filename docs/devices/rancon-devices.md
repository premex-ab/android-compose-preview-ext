# RANCON Devices

This document lists all Rancon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Rancon
- **Usage**: `Devices.Rancon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Rancon.ELLINIKO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`ELLINIKO`** - Elliniko | **DPI**: 320
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MOUNTBAKER`** - Mountbaker | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

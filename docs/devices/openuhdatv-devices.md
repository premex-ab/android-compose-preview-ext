# OPENUHDATV Devices

This document lists all OpenUhdAtv device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: OpenUhdAtv
- **Usage**: `Devices.Openuhdatv.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Openuhdatv.OPEN_UHD_AP)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`OPEN_UHD_AP`** - Open Uhd Ap | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`OPEN_UHD_HK`** - Open Uhd Hk | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

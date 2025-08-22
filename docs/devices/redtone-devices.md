# REDTONE Devices

This document lists all Redtone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Redtone
- **Usage**: `Devices.Redtone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Redtone.RTSP_A124ML)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`RTSP_A124ML`** - Rtsp A124ml | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

- **`RTSP_A258HM`** - Rtsp A258hm | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`RTSP_A64B`** - Rtsp A64b | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

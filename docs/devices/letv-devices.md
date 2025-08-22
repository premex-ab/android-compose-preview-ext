# LETV Devices

This document lists all Letv device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Letv
- **Usage**: `Devices.Letv.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Letv.DEMETERDV)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DEMETERDV`** - Demeterdv | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`DEMETERUHD`** - Demeteruhd | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`LE_S2_WW`** - Le S2 Ww | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`X3_HK`** - X3 Hk | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`X600`** - X600 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1440x2560 (XXL)

**Screen specs**: 1440x2560px | **Aspect ratio**: 9:16

- **`LE_X2`** - Le X2 | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

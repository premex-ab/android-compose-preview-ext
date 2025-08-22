# ALT Devices

This document lists all Alt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Alt
- **Usage**: `Devices.Alt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Alt.ODIN)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`THOR`** - Thor | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

- **`THOR2`** - Thor2 | **DPI**: 220
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=220
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`ODIN`** - Odin | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

- **`ODIN2`** - Odin2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

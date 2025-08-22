# DIXON Devices

This document lists all Dixon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Dixon
- **Usage**: `Devices.Dixon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Dixon.S5790)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`TS_M103A`** - Ts M103a | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`S5790`** - S5790 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# EHLEL Devices

This document lists all Ehlel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ehlel
- **Usage**: `Devices.Ehlel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ehlel.EHLEL_C7PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`EHLEL_DEFENDER_D23`** - Ehlel Defender D23 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`EHLEL_HULAN21`** - Ehlel Hulan21 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`EHLEL_C7PRO`** - Ehlel C7pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

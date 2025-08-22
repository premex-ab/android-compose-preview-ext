# RAYOMOVIL Devices

This document lists all RayoMovil device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: RayoMovil
- **Usage**: `Devices.Rayomovil.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Rayomovil.ATLAS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`RAYO_X1`** - Rayo X1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`ATLAS`** - Atlas | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`ATLAS_2`** - Atlas 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

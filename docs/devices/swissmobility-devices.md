# SWISSMOBILITY Devices

This document lists all Swissmobility device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Swissmobility
- **Usage**: `Devices.Swissmobility.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Swissmobility.B4SWM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`Z7`** - Z7 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 720x1512 (XL)

**Screen specs**: 720x1512px | **Aspect ratio**: 10:21

- **`B4SWM`** - B4swm | **DPI**: 320
  ```kotlin
  spec:width=720,height=1512,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

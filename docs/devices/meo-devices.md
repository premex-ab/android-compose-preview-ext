# MEO Devices

This document lists all Meo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Meo
- **Usage**: `Devices.Meo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Meo.DIW377_MEO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DIW377_MEO`** - Diw377 Meo | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`DIW3930_MEO`** - Diw3930 Meo | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`DV8555_MEO`** - Dv8555 Meo | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 576x720 (Small)

**Screen specs**: 576x720px | **Aspect ratio**: 4:5

- **`DV8985_MEO`** - Dv8985 Meo | **DPI**: 320
  ```kotlin
  spec:width=576,height=720,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

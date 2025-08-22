# MTN Devices

This document lists all Mtn device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mtn
- **Usage**: `Devices.Mtn.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mtn.ALOLA_MAX)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 576x1152 (Large)

**Screen specs**: 576x1152px | **Aspect ratio**: 1:2

- **`ALOLA_MAX`** - Alola Max | **DPI**: 220
  ```kotlin
  spec:width=576,height=1152,unit=px,dpi=220
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`G56`** - G56 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

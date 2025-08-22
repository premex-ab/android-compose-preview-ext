# LEOTEC Devices

This document lists all Leotec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Leotec
- **Usage**: `Devices.Leotec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Leotec.MID1016_MK_32)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MID1016_MK_32`** - Mid1016 Mk 32 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`MID1016_MK_64`** - Mid1016 Mk 64 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# GTEL Devices

This document lists all Gtel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Gtel
- **Usage**: `Devices.Gtel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gtel.DELTA_14)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`DELTA_14`** - Delta 14 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`INFINITY_13`** - Infinity 13 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

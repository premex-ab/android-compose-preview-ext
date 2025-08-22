# MHL Devices

This document lists all Mhl device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Mhl
- **Usage**: `Devices.Mhl.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mhl.TRECFONE_A21S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`TRECFONE_A21S`** - Trecfone A21s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

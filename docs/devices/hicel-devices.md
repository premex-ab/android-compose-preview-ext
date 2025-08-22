# HICEL Devices

This document lists all Hicel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Hicel
- **Usage**: `Devices.Hicel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hicel.STAR_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`STAR_1`** - Star 1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

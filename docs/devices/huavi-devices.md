# HUAVI Devices

This document lists all Huavi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Huavi
- **Usage**: `Devices.Huavi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Huavi.GOLD_77)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`KHATARH20PRO`** - Khatarh20pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`GOLD_77`** - Gold 77 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# LEBEST Devices

This document lists all Lebest device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Lebest
- **Usage**: `Devices.Lebest.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lebest.L2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1604 (XL)

**Screen specs**: 720x1604px | **Aspect ratio**: 180:401

- **`L3`** - L3 | **DPI**: 260
  ```kotlin
  spec:width=720,height=1604,unit=px,dpi=260
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`L2`** - L2 | **DPI**: 260
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=260
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

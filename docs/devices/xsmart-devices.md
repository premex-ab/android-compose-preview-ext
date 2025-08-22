# XSMART Devices

This document lists all Xsmart device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Xsmart
- **Usage**: `Devices.Xsmart.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xsmart.CORE_X)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`MATE_10`** - Mate 10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`NOVA_7`** - Nova 7 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=300
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`CORE_X`** - Core X | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

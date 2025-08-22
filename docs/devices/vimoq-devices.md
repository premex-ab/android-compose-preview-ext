# VIMOQ Devices

This document lists all Vimoq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Vimoq
- **Usage**: `Devices.Vimoq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vimoq.VIMOQ_A631LO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`VIMOQ_A631LO`** - Vimoq A631lo | **DPI**: 200
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=200
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`VIMOQ_P662LO`** - Vimoq P662lo | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`VIMOQ_S661LS`** - Vimoq S661ls | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

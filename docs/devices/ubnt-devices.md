# UBNT Devices

This document lists all Ubnt device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ubnt
- **Usage**: `Devices.Ubnt.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ubnt.CAPRI_UBQ_TELEFI5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`CAPRI_UBQ_TELEFI7`** - Capri Ubq Telefi7 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 640x960 (Medium)

**Screen specs**: 640x960px | **Aspect ratio**: 2:3

- **`CAPRI_UBQ_TELEFI5`** - Capri Ubq Telefi5 | **DPI**: 240
  ```kotlin
  spec:width=640,height=960,unit=px,dpi=240
  ```

- **`CAPRI_UBQ_TELEFI5P`** - Capri Ubq Telefi5p | **DPI**: 240
  ```kotlin
  spec:width=640,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

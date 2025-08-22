# ZAIKAI Devices

This document lists all Zaikai device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zaikai
- **Usage**: `Devices.Zaikai.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zaikai.MENSA_AN64)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`MENSA_AN64`** - Mensa An64 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`T7_AN400`** - T7 An400 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

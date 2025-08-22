# SQ Devices

This document lists all Sq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Sq
- **Usage**: `Devices.Sq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sq.HOPE10_MAX)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`HOPE10_MAX`** - Hope10 Max | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`HOPE8_MAX`** - Hope8 Max | **DPI**: 204
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=204
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

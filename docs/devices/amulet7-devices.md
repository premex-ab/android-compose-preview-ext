# AMULET7 Devices

This document lists all Amulet7 device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Amulet7
- **Usage**: `Devices.Amulet7.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Amulet7.P10SU_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`P10SU_PLUS`** - P10su Plus | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`P10SU_PRO`** - P10su Pro | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

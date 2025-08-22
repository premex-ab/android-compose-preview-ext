# PIVOT Devices

This document lists all Pivot device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Pivot
- **Usage**: `Devices.Pivot.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Pivot.PVT_8_A50_R1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`PVT_8_A50_R1`** - Pvt 8 A50 R1 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`PVT_R78_3288`** - Pvt R78 3288 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# VISUALLAND Devices

This document lists all VisualLand device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: VisualLand
- **Usage**: `Devices.Visualland.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Visualland.ELITE10QH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ELITE10QH`** - Elite10qh | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`ELITE10QHPRO`** - Elite10qhpro | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

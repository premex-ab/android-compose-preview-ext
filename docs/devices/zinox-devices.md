# ZINOX Devices

This document lists all Zinox device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zinox
- **Usage**: `Devices.Zinox.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zinox.ZPAD_X8)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ZPAD_X8`** - Zpad X8 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`ZPAD_X8_PRO`** - Zpad X8 Pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

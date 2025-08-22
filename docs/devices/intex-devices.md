# INTEX Devices

This document lists all Intex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Intex
- **Usage**: `Devices.Intex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Intex.AQUA_RING)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`AQUA_RING`** - Aqua Ring | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`AQUA_SUPREME_PLUS`** - Aqua Supreme Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

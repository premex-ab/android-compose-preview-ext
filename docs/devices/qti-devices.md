# QTI Devices

This document lists all Qti device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Qti
- **Usage**: `Devices.Qti.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Qti.KONA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`KONA`** - Kona | **DPI**: 360
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=360
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# TTFONE Devices

This document lists all Ttfone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ttfone
- **Usage**: `Devices.Ttfone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ttfone.TTFONE_TT20)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`TTFONE_TT20`** - Ttfone Tt20 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

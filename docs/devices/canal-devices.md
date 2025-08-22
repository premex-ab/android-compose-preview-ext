# CANAL Devices

This document lists all Canal device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Canal
- **Usage**: `Devices.Canal.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Canal.CANAL_SAT_BCM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`CANAL_SAT_BCM`** - Canal Sat Bcm | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

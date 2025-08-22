# YSF Devices

This document lists all Ysf device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ysf
- **Usage**: `Devices.Ysf.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ysf.RUGGED_TABLET)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`RUGGED_TABLET`** - Rugged Tablet | **DPI**: 480
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

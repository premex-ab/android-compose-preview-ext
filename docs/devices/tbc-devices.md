# TBC Devices

This document lists all Tbc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Tbc
- **Usage**: `Devices.Tbc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tbc.TATV_8000)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`TATV_8000`** - Tatv 8000 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# CTL Devices

This document lists all Ctl device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ctl
- **Usage**: `Devices.Ctl.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ctl.CTL_IPTV_MRVL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`CTL_IPTV_MRVL`** - Ctl Iptv Mrvl | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

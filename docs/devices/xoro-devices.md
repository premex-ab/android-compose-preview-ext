# XORO Devices

This document lists all Xoro device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Xoro
- **Usage**: `Devices.Xoro.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xoro.MEGAPAD_1333_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`MEGAPAD_1333_PRO`** - Megapad 1333 Pro | **DPI**: 213
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=213
  ```

- **`XORO`** - Xoro | **DPI**: 213
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

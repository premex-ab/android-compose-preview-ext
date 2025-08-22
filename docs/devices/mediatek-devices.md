# MEDIATEK Devices

This document lists all Mediatek device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mediatek
- **Usage**: `Devices.Mediatek.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mediatek.M7332_EU)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`M7332_EU`** - M7332 Eu | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MT5862_512M`** - Mt5862 512m | **DPI**: 160
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

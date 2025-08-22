# TERRA Devices

This document lists all Terra device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Terra
- **Usage**: `Devices.Terra.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Terra.TERRA_MOBILE_PAD_1200)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1280x1920 (XL)

**Screen specs**: 1280x1920px | **Aspect ratio**: 2:3

- **`TERRA_MOBILE_PAD_1200`** - Terra Mobile Pad 1200 | **DPI**: 240
  ```kotlin
  spec:width=1280,height=1920,unit=px,dpi=240
  ```

- **`TERRA_PAD_1200_V2`** - Terra Pad 1200 V2 | **DPI**: 240
  ```kotlin
  spec:width=1280,height=1920,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

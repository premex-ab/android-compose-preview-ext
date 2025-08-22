# ZCS Devices

This document lists all Zcs device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zcs
- **Usage**: `Devices.Zcs.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zcs.Z91)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`Z91`** - Z91 | **DPI**: 240
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=240
  ```

- **`Z92`** - Z92 | **DPI**: 240
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

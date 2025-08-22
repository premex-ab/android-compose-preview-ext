# MEDIABOX Devices

This document lists all Mediabox device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mediabox
- **Usage**: `Devices.Mediabox.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mediabox.DV8235)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DV8235`** - Dv8235 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`JFK`** - Jfk | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

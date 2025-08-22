# TVISION Devices

This document lists all Tvision device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Tvision
- **Usage**: `Devices.Tvision.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tvision.SEI400TM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SEI400TM`** - Sei400tm | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`SEI700TM`** - Sei700tm | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

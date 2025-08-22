# TES Devices

This document lists all Tes device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Tes
- **Usage**: `Devices.Tes.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tes.IGS_SERIES)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`IGS_SERIES`** - Igs Series | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

- **`IGS_SERIES_GEN2`** - Igs Series Gen2 | **DPI**: 160
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

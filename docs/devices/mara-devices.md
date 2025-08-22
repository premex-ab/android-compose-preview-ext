# MARA Devices

This document lists all Mara device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mara
- **Usage**: `Devices.Mara.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mara.MARA_Z_D_SPROUT)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MARA_Z_D_SPROUT`** - Mara Z D Sprout | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`MARA_Z_SPROUT`** - Mara Z Sprout | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# OPENFHDATV Devices

This document lists all OpenFhdAtv device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: OpenFhdAtv
- **Usage**: `Devices.Openfhdatv.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Openfhdatv.OPEN_FHD_AP)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`OPEN_FHD_AP`** - Open Fhd Ap | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`OPEN_FHD_SA`** - Open Fhd Sa | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

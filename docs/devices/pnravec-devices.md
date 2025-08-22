# PNRAVEC Devices

This document lists all PnRavec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: PnRavec
- **Usage**: `Devices.Pnravec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Pnravec.PN_RAVEC_TABLETTE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`PN_RAVEC_TABLETTE`** - Pn Ravec Tablette | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

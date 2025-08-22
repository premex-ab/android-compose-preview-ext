# COPPERNIC Devices

This document lists all Coppernic device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Coppernic
- **Usage**: `Devices.Coppernic.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Coppernic.C_ONE_V2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`C_ONE_V2`** - C One V2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

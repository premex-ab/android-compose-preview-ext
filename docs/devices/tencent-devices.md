# TENCENT Devices

This document lists all Tencent device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Tencent
- **Usage**: `Devices.Tencent.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tencent.VIRTUAL_MACHINE_2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 900x1600 (XL)

**Screen specs**: 900x1600px | **Aspect ratio**: 9:16

- **`VIRTUAL_MACHINE_2`** - Virtual Machine 2 | **DPI**: 240
  ```kotlin
  spec:width=900,height=1600,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# MBO Devices

This document lists all Mbo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mbo
- **Usage**: `Devices.Mbo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mbo._16A_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`_16A_PRO`** -  16a Pro | **DPI**: 240
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=240
  ```

- **`_24S_ULTRA`** -  24s Ultra | **DPI**: 240
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

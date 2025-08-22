# HONDA Devices

This document lists all Honda device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Honda
- **Usage**: `Devices.Honda.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Honda.MSMNILE_AU)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`VCM30T30`** - Vcm30t30 | **DPI**: 160
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=160
  ```

### 720x1920 (XL)

**Screen specs**: 720x1920px | **Aspect ratio**: 3:8

- **`MSMNILE_AU`** - Msmnile Au | **DPI**: 160
  ```kotlin
  spec:width=720,height=1920,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

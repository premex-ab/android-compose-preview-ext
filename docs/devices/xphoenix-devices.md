# XPHOENIX Devices

This document lists all Xphoenix device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Xphoenix
- **Usage**: `Devices.Xphoenix.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Xphoenix.ONETABPRO2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`ONETABPRO2`** - Onetabpro2 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`ONETABPROMATE`** - Onetabpromate | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

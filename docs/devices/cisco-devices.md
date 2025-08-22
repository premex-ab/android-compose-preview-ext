# CISCO Devices

This document lists all Cisco device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Cisco
- **Usage**: `Devices.Cisco.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Cisco.CP_DX80)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1032x1920 (XL)

**Screen specs**: 1032x1920px | **Aspect ratio**: 43:80

- **`CP_DX80`** - Cp Dx80 | **DPI**: 160
  ```kotlin
  spec:width=1032,height=1920,unit=px,dpi=160
  ```

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`_860`** -  860 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

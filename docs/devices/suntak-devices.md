# SUNTAK Devices

This document lists all Suntak device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Suntak
- **Usage**: `Devices.Suntak.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Suntak.MOJO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MOJO`** - Mojo | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`MOX_2`** - Mox 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# RADDY Devices

This document lists all Raddy device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Raddy
- **Usage**: `Devices.Raddy.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Raddy.RADDY_JANJA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`RADDY_JANJA`** - Raddy Janja | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`RADDY_JANJA_PRO`** - Raddy Janja Pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# MASCOM Devices

This document lists all Mascom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Mascom
- **Usage**: `Devices.Mascom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mascom.MASCOM_SS289)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MASCOM_SS289`** - Mascom Ss289 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x856 (Medium)

**Screen specs**: 480x856px | **Aspect ratio**: 60:107

- **`MASCOM_WS517`** - Mascom Ws517 | **DPI**: 240
  ```kotlin
  spec:width=480,height=856,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

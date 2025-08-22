# MOVFAST Devices

This document lists all Movfast device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Movfast
- **Usage**: `Devices.Movfast.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Movfast.MFT1522)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MFT1621`** - Mft1621 | **DPI**: 220
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=220
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MFT1522`** - Mft1522 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# FIREHAWK Devices

This document lists all Firehawk device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Firehawk
- **Usage**: `Devices.Firehawk.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Firehawk.FP_600)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`FP_600`** - Fp 600 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TOUGHDROID`** - Toughdroid | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

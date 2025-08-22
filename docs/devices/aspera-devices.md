# ASPERA Devices

This document lists all Aspera device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Aspera
- **Usage**: `Devices.Aspera.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Aspera.ASPERA_R10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`R9`** - R9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`ASPERA_R10`** - Aspera R10 | **DPI**: 240
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

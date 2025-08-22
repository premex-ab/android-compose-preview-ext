# LUMUS Devices

This document lists all Lumus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Lumus
- **Usage**: `Devices.Lumus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Lumus.INNOSR545)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`INNOSR545`** - Innosr545 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`NEOSR620`** - Neosr620 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

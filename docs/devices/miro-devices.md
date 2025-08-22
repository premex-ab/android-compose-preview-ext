# MIRO Devices

This document lists all Miro device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Miro
- **Usage**: `Devices.Miro.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Miro.A1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 576x1152 (Large)

**Screen specs**: 576x1152px | **Aspect ratio**: 1:2

- **`A1`** - A1 | **DPI**: 220
  ```kotlin
  spec:width=576,height=1152,unit=px,dpi=220
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MIRO_S67`** - Miro S67 | **DPI**: 480
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# PROTON Devices

This document lists all Proton device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Proton
- **Usage**: `Devices.Proton.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Proton.P25_ULTRA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`P25_ULTRA`** - P25 Ultra | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`PROTON_X10_PRO`** - Proton X10 Pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`PROTON_X20_PRO`** - Proton X20 Pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

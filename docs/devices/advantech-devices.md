# ADVANTECH Devices

This document lists all Advantech device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Advantech
- **Usage**: `Devices.Advantech.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Advantech.AIM75_LTE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`AIM75_LTE`** - Aim75 Lte | **DPI**: 420
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=420
  ```

- **`AIM75_WIFI`** - Aim75 Wifi | **DPI**: 420
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=420
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

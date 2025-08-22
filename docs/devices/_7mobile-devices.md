# _7MOBILE Devices

This document lists all _7mobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: _7mobile
- **Usage**: `Devices._7mobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices._7mobile.SWEGUE_2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x996 (Medium)

**Screen specs**: 480x996px | **Aspect ratio**: 40:83

- **`SWEGUE_2`** - Swegue 2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=996,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`_7MOBILE_KAMBA_2`** -  7mobile Kamba 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

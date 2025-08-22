# IWAYLINK Devices

This document lists all Iwaylink device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Iwaylink
- **Usage**: `Devices.Iwaylink.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Iwaylink.MC401_GWL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`TC601B_GWL`** - Tc601b Gwl | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

- **`TC601_GWL`** - Tc601 Gwl | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`MC401_GWL`** - Mc401 Gwl | **DPI**: 160
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

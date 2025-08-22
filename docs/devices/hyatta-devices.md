# HYATTA Devices

This document lists all Hyatta device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hyatta
- **Usage**: `Devices.Hyatta.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hyatta.MODEL_5)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`MODEL_6S`** - Model 6s | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`MODEL_5`** - Model 5 | **DPI**: 220
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# GDL Devices

This document lists all Gdl device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Gdl
- **Usage**: `Devices.Gdl.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gdl.G200)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`G200`** - G200 | **DPI**: 213
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=213
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`Y30`** - Y30 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1650 (XL)

**Screen specs**: 720x1650px | **Aspect ratio**: 24:55

- **`GIGAX_Y21`** - Gigax Y21 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1650,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

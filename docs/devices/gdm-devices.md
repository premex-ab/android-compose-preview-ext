# GDM Devices

This document lists all Gdm device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Gdm
- **Usage**: `Devices.Gdm.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gdm.MB10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`MB10`** - Mb10 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`P4R`** - P4r | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

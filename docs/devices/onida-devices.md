# ONIDA Devices

This document lists all Onida device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Onida
- **Usage**: `Devices.Onida.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Onida.LASALLE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`R4_GTV`** - R4 Gtv | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`LASALLE`** - Lasalle | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`R3`** - R3 | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

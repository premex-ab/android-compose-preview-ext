# UNISTRONG Devices

This document lists all Unistrong device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Unistrong
- **Usage**: `Devices.Unistrong.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Unistrong.UT10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`UT10`** - Ut10 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`UT12`** - Ut12 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`UT30`** - Ut30 | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

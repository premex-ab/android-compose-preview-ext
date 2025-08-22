# ZDK Devices

This document lists all Zdk device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zdk
- **Usage**: `Devices.Zdk.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zdk.ZDKMP_T30A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`ZDKMP_T30B`** - Zdkmp T30b | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ZDKMP_T30A`** - Zdkmp T30a | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

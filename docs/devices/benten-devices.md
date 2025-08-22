# BENTEN Devices

This document lists all Benten device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Benten
- **Usage**: `Devices.Benten.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Benten.BENTEN_T10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BENTEN_T10`** - Benten T10 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

- **`BENTEN_T20`** - Benten T20 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`BENTEN_T30`** - Benten T30 | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

- **`T8`** - T8 | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

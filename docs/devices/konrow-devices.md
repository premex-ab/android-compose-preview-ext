# KONROW Devices

This document lists all Konrow device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Konrow
- **Usage**: `Devices.Konrow.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Konrow.KTAB_1003)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`SKY`** - Sky | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KTAB_1003`** - Ktab 1003 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`KTAB_1004`** - Ktab 1004 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

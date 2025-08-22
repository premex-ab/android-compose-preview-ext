# MBS Devices

This document lists all Mbs device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Mbs
- **Usage**: `Devices.Mbs.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mbs.BLUEFISH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 390x390 (Micro)

**Screen specs**: 390x390px | **Aspect ratio**: 1:1

- **`ICEFISH`** - Icefish | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

- **`TRITON`** - Triton | **DPI**: 320
  ```kotlin
  spec:width=390,height=390,unit=px,dpi=320
  ```

### 400x400 (Micro)

**Screen specs**: 400x400px | **Aspect ratio**: 1:1

- **`LIONFISH`** - Lionfish | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

### 416x416 (Micro)

**Screen specs**: 416x416px | **Aspect ratio**: 1:1

- **`BLUEFISH`** - Bluefish | **DPI**: 320
  ```kotlin
  spec:width=416,height=416,unit=px,dpi=320
  ```

- **`CORALIA`** - Coralia | **DPI**: 320
  ```kotlin
  spec:width=416,height=416,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

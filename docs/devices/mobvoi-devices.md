# MOBVOI Devices

This document lists all Mobvoi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 7
- **Manufacturer**: Mobvoi
- **Usage**: `Devices.Mobvoi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mobvoi.CATFISH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 360x360 (Micro)

**Screen specs**: 360x360px | **Aspect ratio**: 1:1

- **`SKIPJACK`** - Skipjack | **DPI**: 280
  ```kotlin
  spec:width=360,height=360,unit=px,dpi=280
  ```

### 400x400 (Micro)

**Screen specs**: 400x400px | **Aspect ratio**: 1:1

- **`CATFISH`** - Catfish | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

- **`CATFISH_EXT`** - Catfish Ext | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

- **`CATSHARK`** - Catshark | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

- **`MOONEYE`** - Mooneye | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

- **`TUNNY`** - Tunny | **DPI**: 280
  ```kotlin
  spec:width=400,height=400,unit=px,dpi=280
  ```

### 454x454 (Micro)

**Screen specs**: 454x454px | **Aspect ratio**: 1:1

- **`RUBYFISH`** - Rubyfish | **DPI**: 320
  ```kotlin
  spec:width=454,height=454,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

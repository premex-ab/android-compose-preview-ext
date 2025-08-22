# HP Devices

This document lists all Hp device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Hp
- **Usage**: `Devices.Hp.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hp.FIR)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`PANGYO`** - Pangyo | **DPI**: 320
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=320
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`HOLLY`** - Holly | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`ILEX`** - Ilex | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 768x1024 (Medium)

**Screen specs**: 768x1024px | **Aspect ratio**: 3:4

- **`FIR`** - Fir | **DPI**: 160
  ```kotlin
  spec:width=768,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

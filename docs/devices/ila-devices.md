# ILA Devices

This document lists all Ila device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Ila
- **Usage**: `Devices.Ila.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ila.C3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`C3`** - C3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`E1_PLUS`** - E1 Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`E3`** - E3 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`ILA_C1`** - Ila C1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`ILA_E1`** - Ila E1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`ILA_R1`** - Ila R1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`ILA_X2`** - Ila X2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`R1_LITE`** - R1 Lite | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1498 (XL)

**Screen specs**: 720x1498px | **Aspect ratio**: 360:749

- **`ILA_X1`** - Ila X1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1498,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`ILA_X3`** - Ila X3 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

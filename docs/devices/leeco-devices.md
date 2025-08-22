# LEECO Devices

This document lists all Leeco device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Leeco
- **Usage**: `Devices.Leeco.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Leeco.LE_S2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`LE_S2`** - Le S2 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`LE_S2_NA`** - Le S2 Na | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`LE_S2_WW`** - Le S2 Ww | **DPI**: 420
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=420
  ```

- **`LE_ZL1`** - Le Zl1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1440x2560 (XXL)

**Screen specs**: 1440x2560px | **Aspect ratio**: 9:16

- **`LE_X2`** - Le X2 | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

- **`LE_X2_NA`** - Le X2 Na | **DPI**: 560
  ```kotlin
  spec:width=1440,height=2560,unit=px,dpi=560
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# BRONDI Devices

This document lists all Brondi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Brondi
- **Usage**: `Devices.Brondi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Brondi.AMICO_SMARTPHONE_POCKET)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`AMICO_SMARTPHONE_POCKET`** - Amico Smartphone Pocket | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`AMICO_SMARTPHONE_XL`** - Amico Smartphone Xl | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`_850_4G`** -  850 4g | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`AMICO_VERO_4G`** - Amico Vero 4g | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`MIDNIGHT_SKY_EEA`** - Midnight Sky Eea | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

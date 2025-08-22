# INVENS Devices

This document lists all Invens device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Invens
- **Usage**: `Devices.Invens.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Invens.K1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`MAX8`** - Max8 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`MAX5`** - Max5 | **DPI**: 220
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=220
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`K1`** - K1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`MAX9`** - Max9 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

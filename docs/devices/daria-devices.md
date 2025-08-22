# DARIA Devices

This document lists all Daria device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Daria
- **Usage**: `Devices.Daria.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Daria.HORMOZ)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`ZAHEDAN`** - Zahedan | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=440
  ```

### 1080x2436 (XXL)

**Screen specs**: 1080x2436px | **Aspect ratio**: 90:203

- **`QOQNOOS`** - Qoqnoos | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2436,unit=px,dpi=440
  ```

### 1220x2712 (XXL)

**Screen specs**: 1220x2712px | **Aspect ratio**: 305:678

- **`HORMOZ`** - Hormoz | **DPI**: 480
  ```kotlin
  spec:width=1220,height=2712,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

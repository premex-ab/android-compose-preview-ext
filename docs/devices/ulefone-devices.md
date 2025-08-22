# ULEFONE Devices

This document lists all Ulefone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Ulefone
- **Usage**: `Devices.Ulefone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ulefone.ARMOR_3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`ARMOR_3`** - Armor 3 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

- **`POWER_3`** - Power 3 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

- **`POWER_3S`** - Power 3s | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`T816_GQ_ULEFONE`** - T816 Gq Ulefone | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MIX_2`** - Mix 2 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

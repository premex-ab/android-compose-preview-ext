# MIPO Devices

This document lists all Mipo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Mipo
- **Usage**: `Devices.Mipo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mipo.MIPO_M17)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`MIPO_M59`** - Mipo M59 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MIPO_M17`** - Mipo M17 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`MIPO_M25`** - Mipo M25 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`MIPO_M46_PLUS`** - Mipo M46 Plus | **DPI**: 320
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

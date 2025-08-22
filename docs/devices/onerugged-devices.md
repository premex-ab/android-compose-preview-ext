# ONERUGGED Devices

This document lists all Onerugged device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Onerugged
- **Usage**: `Devices.Onerugged.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Onerugged.M185QE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`M185QE`** - M185qe | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`M86XE`** - M86xe | **DPI**: 321
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=321
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`MP1T`** - Mp1t | **DPI**: 360
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=360
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`MPC80T`** - Mpc80t | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

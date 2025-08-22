# DISH Devices

This document lists all Dish device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Dish
- **Usage**: `Devices.Dish.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Dish.DISH_CABLE_BCM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DISH_CABLE_BCM`** - Dish Cable Bcm | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`U695DS`** - U695ds | **DPI**: 400
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=400
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SL104D`** - Sl104d | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`SL201D`** - Sl201d | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`DSH98123`** - Dsh98123 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

- **`U653DS`** - U653ds | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`SN339D`** - Sn339d | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

- **`SN339D_SMT`** - Sn339d Smt | **DPI**: 280
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

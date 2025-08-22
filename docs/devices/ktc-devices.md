# KTC Devices

This document lists all Ktc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 10
- **Manufacturer**: Ktc
- **Usage**: `Devices.Ktc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ktc.BLISS503)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`HONGKONG`** - Hongkong | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`LAVENDER`** - Lavender | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`LEO`** - Leo | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

- **`SAGITTARIUS`** - Sagittarius | **DPI**: 240
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=240
  ```

- **`ZHONGSHAN`** - Zhongshan | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`CAPRICORN`** - Capricorn | **DPI**: 560
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=560
  ```

- **`W83B_F2_RK3576`** - W83b F2 Rk3576 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MOUNTBAKER`** - Mountbaker | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`STANFORD`** - Stanford | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`BLISS503`** - Bliss503 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

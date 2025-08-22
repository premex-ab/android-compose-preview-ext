# HTC Devices

This document lists all Htc device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Htc
- **Usage**: `Devices.Htc.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Htc.HTC_A37DJ_DUGL)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`HTC_IMLDUGL`** - Htc Imldugl | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`HTC_A37DJ_DUGL`** - Htc A37dj Dugl | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

- **`HTC_A37_DUGL`** - Htc A37 Dugl | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`HTC_BRE2DUGL`** - Htc Bre2dugl | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`HTC_BRE2EXDUGL`** - Htc Bre2exdugl | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

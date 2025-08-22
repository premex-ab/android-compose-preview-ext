# KOOBEE Devices

This document lists all Koobee device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Koobee
- **Usage**: `Devices.Koobee.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Koobee.KOOBEE_F2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`KOOBEE_F2`** - Koobee F2 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2246 (XXL)

**Screen specs**: 1080x2246px | **Aspect ratio**: 540:1123

- **`KOOBEE_F2_PLUS`** - Koobee F2 Plus | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2246,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`KOOBEE_S12`** - Koobee S12 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1500 (XL)

**Screen specs**: 720x1500px | **Aspect ratio**: 12:25

- **`KOOBEE_K10`** - Koobee K10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1500,unit=px,dpi=320
  ```

### 720x1520 (XL)

**Screen specs**: 720x1520px | **Aspect ratio**: 9:19

- **`KOOBEE_K20`** - Koobee K20 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1520,unit=px,dpi=320
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`KOOBEE_S16`** - Koobee S16 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

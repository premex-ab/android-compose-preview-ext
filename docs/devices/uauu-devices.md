# UAUU Devices

This document lists all Uauu device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Uauu
- **Usage**: `Devices.Uauu.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Uauu.M10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`T30`** - T30 | **DPI**: 304
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=304
  ```

- **`T30PRO`** - T30pro | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`T60`** - T60 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`T90_NEW`** - T90 New | **DPI**: 272
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=272
  ```

### 1536x2048 (XL)

**Screen specs**: 1536x2048px | **Aspect ratio**: 3:4

- **`M10`** - M10 | **DPI**: 240
  ```kotlin
  spec:width=1536,height=2048,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`U10`** - U10 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

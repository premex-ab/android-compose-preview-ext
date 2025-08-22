# AQUA Devices

This document lists all Aqua device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Aqua
- **Usage**: `Devices.Aqua.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Aqua.BROADWAY)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DAAN`** - Daan | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`DUPONT`** - Dupont | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`HANYANG`** - Hanyang | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`IRVINE`** - Irvine | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`JORDAN`** - Jordan | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`OMONIA`** - Omonia | **DPI**: 320
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`BROADWAY`** - Broadway | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`DETO`** - Deto | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`NIPPORI`** - Nippori | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

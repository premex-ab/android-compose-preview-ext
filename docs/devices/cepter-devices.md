# CEPTER Devices

This document lists all Cepter device specifications available for Android Compose previews.

## Overview

- **Total devices**: 15
- **Manufacturer**: Cepter
- **Usage**: `Devices.Cepter.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Cepter.BURBANK)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`BURBANK`** - Burbank | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`LAKESIDE`** - Lakeside | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`CTABTERRA128`** - Ctabterra128 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`CTABTERRA256`** - Ctabterra256 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`CEPTERTAB1095`** - Ceptertab1095 | **DPI**: 213
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=213
  ```

- **`CTABNEXUS`** - Ctabnexus | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 1600x2560 (XXL)

**Screen specs**: 1600x2560px | **Aspect ratio**: 5:8

- **`CEPTERTABP12`** - Ceptertabp12 | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=320
  ```

- **`CTABEVOP12`** - Ctabevop12 | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=320
  ```

- **`CTABTITAN12`** - Ctabtitan12 | **DPI**: 320
  ```kotlin
  spec:width=1600,height=2560,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`NAGAI`** - Nagai | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`CEPTERTAB101`** - Ceptertab101 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`CEPTERTAB10E`** - Ceptertab10e | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`CEPTER_TAB_10L`** - Cepter Tab 10l | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`CEPTER_TAB_10S`** - Cepter Tab 10s | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`CTABERA101`** - Ctabera101 | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

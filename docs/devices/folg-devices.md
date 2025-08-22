# FOLG Devices

This document lists all Folg device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Folg
- **Usage**: `Devices.Folg.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Folg.FOLG_GT_10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`FOLG_GT_10`** - Folg Gt 10 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`S18`** - S18 | **DPI**: 360
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=360
  ```

- **`S30`** - S30 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`S19`** - S19 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`FT02`** - Ft02 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`FOLG_TAB_10`** - Folg Tab 10 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`FOLG_TAB_10S`** - Folg Tab 10s | **DPI**: 180
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=180
  ```

- **`FT01`** - Ft01 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`KS20`** - Ks20 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

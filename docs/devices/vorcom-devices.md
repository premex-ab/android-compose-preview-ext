# VORCOM Devices

This document lists all Vorcom device specifications available for Android Compose previews.

## Overview

- **Total devices**: 9
- **Manufacturer**: Vorcom
- **Usage**: `Devices.Vorcom.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Vorcom.AVALON)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`QUARTZPRO`** - Quartzpro | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`AVALON`** - Avalon | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

- **`ULTRAPAD`** - Ultrapad | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

### 600x1022 (Medium)

**Screen specs**: 600x1022px | **Aspect ratio**: 300:511

- **`S7_CLASSIC_10`** - S7 Classic 10 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1022,unit=px,dpi=160
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`S7_CLASSIC`** - S7 Classic | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`QUARTZLITE`** - Quartzlite | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`S12_CLASSIC`** - S12 Classic | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`S8PRO`** - S8pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

- **`SXPRO_CLASSIC`** - Sxpro Classic | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# TREKSTOR Devices

This document lists all Trekstor device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Trekstor
- **Usage**: `Devices.Trekstor.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Trekstor.SURFTAB)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`TOLINO8`** - Tolino8 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

- **`TOLINO89`** - Tolino89 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SURFTAB`** - Surftab | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

### 900x1440 (Large)

**Screen specs**: 900x1440px | **Aspect ratio**: 5:8

- **`TOLINO7`** - Tolino7 | **DPI**: 240
  ```kotlin
  spec:width=900,height=1440,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

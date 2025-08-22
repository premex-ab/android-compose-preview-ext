# GTOUCH Devices

This document lists all GTouch device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: GTouch
- **Usage**: `Devices.Gtouch.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gtouch.STELLA_OMEGA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`STELLA_OMEGA`** - Stella Omega | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`STELLA_OMEGA_PLUS`** - Stella Omega Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`STELLA_X_PLUS`** - Stella X Plus | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`STELLA_XS`** - Stella Xs | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

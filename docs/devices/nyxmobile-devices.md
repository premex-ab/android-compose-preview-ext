# NYXMOBILE Devices

This document lists all NyxMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: NyxMobile
- **Usage**: `Devices.Nyxmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Nyxmobile.CLICK)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`CLICK`** - Click | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`NYX_SHADE`** - Nyx Shade | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

- **`REX`** - Rex | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`GLAM`** - Glam | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`KIN`** - Kin | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

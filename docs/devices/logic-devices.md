# LOGIC Devices

This document lists all Logic device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Logic
- **Usage**: `Devices.Logic.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Logic.L55A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`MTK9679`** - Mtk9679 | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

- **`RK3576_U`** - Rk3576 U | **DPI**: 480
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=480
  ```

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`X4`** - X4 | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`L55A`** - L55a | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`LOGIC_L57`** - Logic L57 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

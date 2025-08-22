# ALLCALL Devices

This document lists all Allcall device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Allcall
- **Usage**: `Devices.Allcall.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Allcall.ALLCALL_S1_X)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`MIX2`** - Mix2 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`ALLCALL_S1_X`** - Allcall S1 X | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

- **`S5500`** - S5500 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1640 (XL)

**Screen specs**: 720x1640px | **Aspect ratio**: 18:41

- **`HERO_20_PRO`** - Hero 20 Pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1640,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

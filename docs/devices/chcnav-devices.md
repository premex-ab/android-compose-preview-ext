# CHCNAV Devices

This document lists all Chcnav device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Chcnav
- **Usage**: `Devices.Chcnav.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Chcnav.HCE600)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`LT60`** - Lt60 | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=420
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`LT700`** - Lt700 | **DPI**: 306
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=306
  ```

- **`LT800`** - Lt800 | **DPI**: 360
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=360
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`HCE600`** - Hce600 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

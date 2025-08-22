# EUDORA Devices

This document lists all Eudora device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Eudora
- **Usage**: `Devices.Eudora.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Eudora.E10PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x1014 (Medium)

**Screen specs**: 480x1014px | **Aspect ratio**: 80:169

- **`E62PLUS`** - E62plus | **DPI**: 213
  ```kotlin
  spec:width=480,height=1014,unit=px,dpi=213
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`E65PRO`** - E65pro | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`E10PRO`** - E10pro | **DPI**: 190
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=190
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# PIXPEAK Devices

This document lists all Pixpeak device specifications available for Android Compose previews.

## Overview

- **Total devices**: 6
- **Manufacturer**: Pixpeak
- **Usage**: `Devices.Pixpeak.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Pixpeak.L60_EEA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`M258_EEA`** - M258 Eea | **DPI**: 213
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=213
  ```

- **`P107_EEA`** - P107 Eea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`U921`** - U921 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`U921_EEA`** - U921 Eea | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`TABLET`** - Tablet | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`L60_EEA`** - L60 Eea | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

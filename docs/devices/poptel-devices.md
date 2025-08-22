# POPTEL Devices

This document lists all Poptel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Poptel
- **Usage**: `Devices.Poptel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Poptel.P10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`P9000_MAX`** - P9000 Max | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`P60`** - P60 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`P8`** - P8 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 640x1280 (Large)

**Screen specs**: 640x1280px | **Aspect ratio**: 1:2

- **`P10`** - P10 | **DPI**: 320
  ```kotlin
  spec:width=640,height=1280,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`V9`** - V9 | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

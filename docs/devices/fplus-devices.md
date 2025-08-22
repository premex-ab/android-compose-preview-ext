# FPLUS Devices

This document lists all Fplus device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Fplus
- **Usage**: `Devices.Fplus.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Fplus.H166)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`P670`** - P670 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`LIFETABPLUS`** - Lifetabplus | **DPI**: 213
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=213
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SA70`** - Sa70 | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`H166`** - H166 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# FREEYOND Devices

This document lists all Freeyond device specifications available for Android Compose previews.

## Overview

- **Total devices**: 8
- **Manufacturer**: Freeyond
- **Usage**: `Devices.Freeyond.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Freeyond.F9)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2460 (XXL)

**Screen specs**: 1080x2460px | **Aspect ratio**: 18:41

- **`M6`** - M6 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2460,unit=px,dpi=480
  ```

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`FREEYONDA5`** - Freeyonda5 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`F9`** - F9 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`M5`** - M5 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

### 720x1612 (XL)

**Screen specs**: 720x1612px | **Aspect ratio**: 180:403

- **`F9S`** - F9s | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`F9S_EEA`** - F9s Eea | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

- **`M5A`** - M5a | **DPI**: 320
  ```kotlin
  spec:width=720,height=1612,unit=px,dpi=320
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`FREEYONDP6`** - Freeyondp6 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# BPHONE Devices

This document lists all Bphone device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Bphone
- **Usage**: `Devices.Bphone.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bphone.B2017)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`B2017`** - B2017 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`BPHONE_B86`** - Bphone B86 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`BPHONE_A85_5G`** - Bphone A85 5g | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`BPHONE_A_SERIES`** - Bphone A Series | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

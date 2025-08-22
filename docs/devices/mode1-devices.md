# MODE1 Devices

This document lists all Mode1 device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Mode1
- **Usage**: `Devices.Mode1.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mode1.MD06P)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2220 (XXL)

**Screen specs**: 1080x2220px | **Aspect ratio**: 18:37

- **`MD_04P`** - Md 04p | **DPI**: 440
  ```kotlin
  spec:width=1080,height=2220,unit=px,dpi=440
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`MD_03P`** - Md 03p | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`MD06P`** - Md06p | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# OPTICON Devices

This document lists all Opticon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Opticon
- **Usage**: `Devices.Opticon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Opticon.H31)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`H31`** - H31 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=440
  ```

- **`H33`** - H33 | **DPI**: 440
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=440
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`H_35`** - H 35 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

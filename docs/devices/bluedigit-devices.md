# BLUEDIGIT Devices

This document lists all Bluedigit device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Bluedigit
- **Usage**: `Devices.Bluedigit.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bluedigit.RAVOZ_R4)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`RAVOZ_R8`** - Ravoz R8 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2246 (XXL)

**Screen specs**: 1080x2246px | **Aspect ratio**: 540:1123

- **`RAVOZ_R9`** - Ravoz R9 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2246,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`RAVOZ_R4`** - Ravoz R4 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

- **`RAVOZ_R7`** - Ravoz R7 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

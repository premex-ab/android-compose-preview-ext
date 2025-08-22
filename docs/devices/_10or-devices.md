# _10OR Devices

This document lists all _10or device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: _10or
- **Usage**: `Devices._10or.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices._10or.E)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`E`** - E | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

- **`G`** - G | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2246 (XXL)

**Screen specs**: 1080x2246px | **Aspect ratio**: 540:1123

- **`G2`** - G2 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2246,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`_10OR_D`** -  10or D | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

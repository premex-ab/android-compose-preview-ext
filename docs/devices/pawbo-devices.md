# PAWBO Devices

This document lists all Pawbo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Pawbo
- **Usage**: `Devices.Pawbo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Pawbo.TAB_T13)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`TAB_T13`** - Tab T13 | **DPI**: 210
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=210
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TAB_T8`** - Tab T8 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# GINI Devices

This document lists all Gini device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Gini
- **Usage**: `Devices.Gini.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gini.E6_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`E6_PLUS`** - E6 Plus | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`GINI_S5PRO`** - Gini S5pro | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

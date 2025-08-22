# BARTEC Devices

This document lists all Bartec device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Bartec
- **Usage**: `Devices.Bartec.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Bartec.PIXAVIPHONE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`PIXAVIPHONE`** - Pixaviphone | **DPI**: 480
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=480
  ```

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`SP9EX1`** - Sp9ex1 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

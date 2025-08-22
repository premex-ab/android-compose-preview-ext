# MAXRON Devices

This document lists all Maxron device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Maxron
- **Usage**: `Devices.Maxron.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Maxron.MXPAD)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`MXPAD`** - Mxpad | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`MXULTRA`** - Mxultra | **DPI**: 280
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

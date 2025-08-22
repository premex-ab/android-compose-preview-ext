# ZEEKER Devices

This document lists all Zeeker device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Zeeker
- **Usage**: `Devices.Zeeker.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Zeeker.ZEEKER_P10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`ZEEKER_T100`** - Zeeker T100 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=480
  ```

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`ZEEKER_P10`** - Zeeker P10 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

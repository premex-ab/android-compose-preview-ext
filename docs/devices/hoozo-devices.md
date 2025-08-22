# HOOZO Devices

This document lists all Hoozo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hoozo
- **Usage**: `Devices.Hoozo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hoozo.MR768)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`T10A`** - T10a | **DPI**: 180
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=180
  ```

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`MR768`** - Mr768 | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

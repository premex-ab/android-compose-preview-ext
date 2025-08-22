# CLIDE Devices

This document lists all Clide device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Clide
- **Usage**: `Devices.Clide.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Clide.A10A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`A10A`** - A10a | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`A10B`** - A10b | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

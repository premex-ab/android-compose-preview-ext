# LEOMO Devices

This document lists all Leomo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Leomo
- **Usage**: `Devices.Leomo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Leomo.LMS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 240x400 (Micro)

**Screen specs**: 240x400px | **Aspect ratio**: 3:5

- **`LMS`** - Lms | **DPI**: 120
  ```kotlin
  spec:width=240,height=400,unit=px,dpi=120
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

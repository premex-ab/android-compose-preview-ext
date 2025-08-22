# JUMPER Devices

This document lists all Jumper device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Jumper
- **Usage**: `Devices.Jumper.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Jumper.EZPAD_M10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`EZPAD_M10`** - Ezpad M10 | **DPI**: 240
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=240
  ```

- **`EZPAD_M10S`** - Ezpad M10s | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

- **`EZPAD_M11`** - Ezpad M11 | **DPI**: 280
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# WAVE8 Devices

This document lists all Wave8 device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Wave8
- **Usage**: `Devices.Wave8.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wave8.WAVE_8_10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`WAVE_8_10`** - Wave 8 10 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`WAVE_8_7`** - Wave 8 7 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

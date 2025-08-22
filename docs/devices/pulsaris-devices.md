# PULSARIS Devices

This document lists all Pulsaris device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Pulsaris
- **Usage**: `Devices.Pulsaris.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Pulsaris.FRESH)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`PLUMA`** - Pluma | **DPI**: 220
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=220
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`FRESH`** - Fresh | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

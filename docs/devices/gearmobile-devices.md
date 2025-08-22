# GEARMOBILE Devices

This document lists all GearMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: GearMobile
- **Usage**: `Devices.Gearmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Gearmobile.GM10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2280 (XXL)

**Screen specs**: 1080x2280px | **Aspect ratio**: 9:19

- **`GM30`** - Gm30 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2280,unit=px,dpi=480
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`GM10`** - Gm10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

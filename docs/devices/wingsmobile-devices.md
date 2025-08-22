# WINGSMOBILE Devices

This document lists all WingsMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: WingsMobile
- **Usage**: `Devices.Wingsmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Wingsmobile.W4)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2340 (XXL)

**Screen specs**: 1080x2340px | **Aspect ratio**: 6:13

- **`W7_Q`** - W7 Q | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2340,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`W4`** - W4 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

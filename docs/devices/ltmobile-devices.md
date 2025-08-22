# LTMOBILE Devices

This document lists all LtMobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: LtMobile
- **Usage**: `Devices.Ltmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ltmobile.LT_2003)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2400 (XXL)

**Screen specs**: 1080x2400px | **Aspect ratio**: 9:20

- **`LT_MOBILE_E6707`** - Lt Mobile E6707 | **DPI**: 480
  ```kotlin
  spec:width=1080,height=2400,unit=px,dpi=480
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`LT_2003`** - Lt 2003 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

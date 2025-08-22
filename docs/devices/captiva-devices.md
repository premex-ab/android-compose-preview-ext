# CAPTIVA Devices

This document lists all Captiva device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Captiva
- **Usage**: `Devices.Captiva.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Captiva.PAD_10_2_IN_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`PAD_10_2_IN_1`** - Pad 10 2 In 1 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

- **`PAD_10_3G_PLUS`** - Pad 10 3g Plus | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

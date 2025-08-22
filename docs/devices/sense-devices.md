# SENSE Devices

This document lists all Sense device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Sense
- **Usage**: `Devices.Sense.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sense.TW102)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`TW102`** - Tw102 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

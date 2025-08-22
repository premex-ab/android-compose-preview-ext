# EE Devices

This document lists all Ee device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ee
- **Usage**: `Devices.Ee.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ee.HARRIER_TAB)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`HARRIER_TAB`** - Harrier Tab | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

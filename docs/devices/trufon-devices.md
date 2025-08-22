# TRUFON Devices

This document lists all Trufon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Trufon
- **Usage**: `Devices.Trufon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Trufon.TRUFON_FLEX)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`TRUFON_FLEX`** - Trufon Flex | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

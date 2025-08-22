# NEON Devices

This document lists all Neon device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Neon
- **Usage**: `Devices.Neon.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Neon.NEON_TAB_11)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x1920 (XL)

**Screen specs**: 1200x1920px | **Aspect ratio**: 5:8

- **`NEON_TAB_11`** - Neon Tab 11 | **DPI**: 320
  ```kotlin
  spec:width=1200,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

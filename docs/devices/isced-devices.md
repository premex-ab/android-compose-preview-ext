# ISCED Devices

This document lists all Isced device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Isced
- **Usage**: `Devices.Isced.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Isced.ISCEDTAB21)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`ISCEDTAB21`** - Iscedtab21 | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

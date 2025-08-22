# HQ Devices

This document lists all Hq device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Hq
- **Usage**: `Devices.Hq.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hq.TABLET_HQ_T616)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`TABLET_HQ_T616`** - Tablet Hq T616 | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

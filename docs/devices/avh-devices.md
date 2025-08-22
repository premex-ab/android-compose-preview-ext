# AVH Devices

This document lists all Avh device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Avh
- **Usage**: `Devices.Avh.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Avh.EXCER_10_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`EXCER_10_PRO`** - Excer 10 Pro | **DPI**: 213
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

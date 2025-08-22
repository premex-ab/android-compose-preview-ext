# CLIO Devices

This document lists all Clio device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Clio
- **Usage**: `Devices.Clio.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Clio.NEO_4_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`NEO_4_PLUS`** - Neo 4 Plus | **DPI**: 220
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

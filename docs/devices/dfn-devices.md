# DFN Devices

This document lists all Dfn device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Dfn
- **Usage**: `Devices.Dfn.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Dfn.AMIGO7X3)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x720 (Small)

**Screen specs**: 480x720px | **Aspect ratio**: 2:3

- **`AMIGO7X3`** - Amigo7x3 | **DPI**: 320
  ```kotlin
  spec:width=480,height=720,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

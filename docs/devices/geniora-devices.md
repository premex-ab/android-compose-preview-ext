# GENIORA Devices

This document lists all Geniora device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Geniora
- **Usage**: `Devices.Geniora.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Geniora.GEN1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`GEN1`** - Gen1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

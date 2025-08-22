# AXEL Devices

This document lists all Axel device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Axel
- **Usage**: `Devices.Axel.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Axel.AX_PRO)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`AX_PRO`** - Ax Pro | **DPI**: 160
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

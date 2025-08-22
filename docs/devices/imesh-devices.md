# IMESH Devices

This document lists all Imesh device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Imesh
- **Usage**: `Devices.Imesh.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Imesh.IM_560)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`IM_560`** - Im 560 | **DPI**: 200
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

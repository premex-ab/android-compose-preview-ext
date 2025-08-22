# MOT Devices

This document lists all Mot device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Mot
- **Usage**: `Devices.Mot.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mot.S22_8A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`S22_8A`** - S22 8a | **DPI**: 320
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

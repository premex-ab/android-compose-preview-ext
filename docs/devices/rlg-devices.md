# RLG Devices

This document lists all Rlg device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Rlg
- **Usage**: `Devices.Rlg.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Rlg.EAGLE_2024)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`EAGLE_2024`** - Eagle 2024 | **DPI**: 240
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# GRID Devices

This document lists all Grid device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Grid
- **Usage**: `Devices.Grid.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Grid.GRID_GS6100)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`GRID_GS6100`** - Grid Gs6100 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

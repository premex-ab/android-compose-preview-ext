# TMCELL Devices

This document lists all TmCell device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: TmCell
- **Usage**: `Devices.Tmcell.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tmcell.LOGIC_X60_PLUS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`LOGIC_X60_PLUS`** - Logic X60 Plus | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

- **`UNONU_W60_PLUS`** - Unonu W60 Plus | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

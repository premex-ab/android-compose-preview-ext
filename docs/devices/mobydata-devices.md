# MOBYDATA Devices

This document lists all Mobydata device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Mobydata
- **Usage**: `Devices.Mobydata.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mobydata.M63S)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x800 (Small)

**Screen specs**: 480x800px | **Aspect ratio**: 3:5

- **`M63S`** - M63s | **DPI**: 240
  ```kotlin
  spec:width=480,height=800,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

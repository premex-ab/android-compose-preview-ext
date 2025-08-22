# MODE Devices

This document lists all Mode device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Mode
- **Usage**: `Devices.Mode.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Mode.MP1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MP1`** - Mp1 | **DPI**: 300
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

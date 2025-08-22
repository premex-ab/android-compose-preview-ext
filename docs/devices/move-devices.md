# MOVE Devices

This document lists all Move device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Move
- **Usage**: `Devices.Move.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Move.DV8919_KSM)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`DV8919_KSM`** - Dv8919 Ksm | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

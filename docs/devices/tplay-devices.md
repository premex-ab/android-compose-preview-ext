# TPLAY Devices

This document lists all Tplay device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Tplay
- **Usage**: `Devices.Tplay.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Tplay.SEI800TCT)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SEI800TCT`** - Sei800tct | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

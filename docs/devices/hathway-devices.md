# HATHWAY Devices

This document lists all Hathway device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hathway
- **Usage**: `Devices.Hathway.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hathway.SEI103)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SEI103`** - Sei103 | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`SEI111H`** - Sei111h | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# ZIFFLER Devices

This document lists all Ziffler device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Ziffler
- **Usage**: `Devices.Ziffler.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ziffler.SHINAGAWA)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SHINAGAWA`** - Shinagawa | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

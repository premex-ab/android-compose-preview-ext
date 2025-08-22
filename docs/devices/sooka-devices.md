# SOOKA Devices

This document lists all Sooka device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Sooka
- **Usage**: `Devices.Sooka.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Sooka.SOOKA_TV_V1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SOOKA_TV_V1`** - Sooka Tv V1 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# YANDEX Devices

This document lists all Yandex device specifications available for Android Compose previews.

## Overview

- **Total devices**: 1
- **Manufacturer**: Yandex
- **Usage**: `Devices.Yandex.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Yandex.AMBER)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x2160 (XL)

**Screen specs**: 1080x2160px | **Aspect ratio**: 1:2

- **`AMBER`** - Amber | **DPI**: 420
  ```kotlin
  spec:width=1080,height=2160,unit=px,dpi=420
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

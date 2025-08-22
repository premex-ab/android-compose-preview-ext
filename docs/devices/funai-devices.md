# FUNAI Devices

This document lists all Funai device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Funai
- **Usage**: `Devices.Funai.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Funai.DAITOU)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`DAITOU`** - Daitou | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`FAS_K2150`** - Fas K2150 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

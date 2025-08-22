# IBRIDGE Devices

This document lists all IBridge device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: IBridge
- **Usage**: `Devices.Ibridge.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ibridge.IBT01H_BDS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1200x2000 (XL)

**Screen specs**: 1200x2000px | **Aspect ratio**: 3:5

- **`IBT01H_BDS`** - Ibt01h Bds | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

- **`IBT02H`** - Ibt02h | **DPI**: 240
  ```kotlin
  spec:width=1200,height=2000,unit=px,dpi=240
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

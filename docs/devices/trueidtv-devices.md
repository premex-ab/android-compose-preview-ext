# TRUEIDTV Devices

This document lists all Trueidtv device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Trueidtv
- **Usage**: `Devices.Trueidtv.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Trueidtv.HP4CE_TRUEVISIONS)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SEI600TID`** - Sei600tid | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`HP4CE_TRUEVISIONS`** - Hp4ce Truevisions | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# SMARTTEK Devices

This document lists all SmartTek device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: SmartTek
- **Usage**: `Devices.Smarttek.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Smarttek.MR_POTATO_HEAD)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 600x1024 (Medium)

**Screen specs**: 600x1024px | **Aspect ratio**: 75:128

- **`MR_POTATO_HEAD`** - Mr Potato Head | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

- **`PLAY_DOH`** - Play Doh | **DPI**: 160
  ```kotlin
  spec:width=600,height=1024,unit=px,dpi=160
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# STARMOBILE Devices

This document lists all Starmobile device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Starmobile
- **Usage**: `Devices.Starmobile.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Starmobile.PLAY_CLICK_LTE)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`PLAY_CLICK_LTE`** - Play Click Lte | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`UP_PRIME`** - Up Prime | **DPI**: 320
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

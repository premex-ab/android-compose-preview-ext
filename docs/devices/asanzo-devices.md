# ASANZO Devices

This document lists all Asanzo device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Asanzo
- **Usage**: `Devices.Asanzo.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Asanzo.ASANZO_A2)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`SW6H`** - Sw6h | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`ASANZO_A2`** - Asanzo A2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`S6`** - S6 | **DPI**: 240
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`SHIBUYA`** - Shibuya | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

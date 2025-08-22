# STARLIGHT Devices

This document lists all Starlight device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Starlight
- **Usage**: `Devices.Starlight.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Starlight.TAMACHI)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`YEONGDEUNGPO`** - Yeongdeungpo | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 442x960 (Medium)

**Screen specs**: 442x960px | **Aspect ratio**: 221:480

- **`VENUS_PLUS`** - Venus Plus | **DPI**: 240
  ```kotlin
  spec:width=442,height=960,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`TAMACHI`** - Tamachi | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

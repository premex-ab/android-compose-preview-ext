# BLACKLINE Devices

This document lists all Blackline device specifications available for Android Compose previews.

## Overview

- **Total devices**: 5
- **Manufacturer**: Blackline
- **Usage**: `Devices.Blackline.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Blackline.R10G)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`R4`** - R4 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

- **`R4_GTV`** - R4 Gtv | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`R10G`** - R10g | **DPI**: 320
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=320
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`R3`** - R3 | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

- **`R3_GTV`** - R3 Gtv | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

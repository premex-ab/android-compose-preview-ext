# NGM Devices

This document lists all Ngm device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Ngm
- **Usage**: `Devices.Ngm.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Ngm.E506)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 1080x1920 (XL)

**Screen specs**: 1080x1920px | **Aspect ratio**: 9:16

- **`R2`** - R2 | **DPI**: 320
  ```kotlin
  spec:width=1080,height=1920,unit=px,dpi=320
  ```

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`E506`** - E506 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 720x1280 (Large)

**Screen specs**: 720x1280px | **Aspect ratio**: 9:16

- **`R1`** - R1 | **DPI**: 213
  ```kotlin
  spec:width=720,height=1280,unit=px,dpi=213
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

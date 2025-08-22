# HIKVISION Devices

This document lists all Hikvision device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Hikvision
- **Usage**: `Devices.Hikvision.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Hikvision.DS_D5C65RB_A)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 2160x3840 (XXL)

**Screen specs**: 2160x3840px | **Aspect ratio**: 9:16

- **`DS_D5C65RB_A`** - Ds D5c65rb A | **DPI**: 640
  ```kotlin
  spec:width=2160,height=3840,unit=px,dpi=640
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`DS_MDT202`** - Ds Mdt202 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# MOXEE Devices

This document lists all Moxee device specifications available for Android Compose previews.

## Overview

- **Total devices**: 2
- **Manufacturer**: Moxee
- **Usage**: `Devices.Moxee.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Moxee.M2307)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`M2307`** - M2307 | **DPI**: 200
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=200
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`T2310`** - T2310 | **DPI**: 200
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=200
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

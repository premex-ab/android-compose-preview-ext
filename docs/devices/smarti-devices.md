# SMARTI Devices

This document lists all Smarti device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Smarti
- **Usage**: `Devices.Smarti.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Smarti.SMARTI_GEN_1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`SMARTI_GEN_1`** - Smarti Gen 1 | **DPI**: 240
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=240
  ```

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SMARTI_GEN_2`** - Smarti Gen 2 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 800x1280 (Large)

**Screen specs**: 800x1280px | **Aspect ratio**: 5:8

- **`SMARTI_T2_PLUS`** - Smarti T2 Plus | **DPI**: 220
  ```kotlin
  spec:width=800,height=1280,unit=px,dpi=220
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

# FIGI Devices

This document lists all Figi device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Figi
- **Usage**: `Devices.Figi.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Figi.FJ)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`G6`** - G6 | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 540x1132 (Large)

**Screen specs**: 540x1132px | **Aspect ratio**: 135:283

- **`FX`** - Fx | **DPI**: 240
  ```kotlin
  spec:width=540,height=1132,unit=px,dpi=240
  ```

### 600x1280 (Large)

**Screen specs**: 600x1280px | **Aspect ratio**: 15:32

- **`FJ`** - Fj | **DPI**: 300
  ```kotlin
  spec:width=600,height=1280,unit=px,dpi=300
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

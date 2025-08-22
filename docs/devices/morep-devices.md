# MOREP Devices

This document lists all Morep device specifications available for Android Compose previews.

## Overview

- **Total devices**: 4
- **Manufacturer**: Morep
- **Usage**: `Devices.Morep.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Morep.MAVIC_10)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x854 (Medium)

**Screen specs**: 480x854px | **Aspect ratio**: 240:427

- **`SMART_V1`** - Smart V1 | **DPI**: 200
  ```kotlin
  spec:width=480,height=854,unit=px,dpi=200
  ```

### 720x1560 (XL)

**Screen specs**: 720x1560px | **Aspect ratio**: 6:13

- **`MAVIC_PLUS`** - Mavic Plus | **DPI**: 280
  ```kotlin
  spec:width=720,height=1560,unit=px,dpi=280
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`MAVIC_10`** - Mavic 10 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=320
  ```

- **`MAVIC_30`** - Mavic 30 | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*

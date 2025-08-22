# SMART Devices

This document lists all Smart device specifications available for Android Compose previews.

## Overview

- **Total devices**: 3
- **Manufacturer**: Smart
- **Usage**: `Devices.Smart.DEVICE_NAME`

## Usage Example

```kotlin
import se.premex.compose.preview.devices.*

@Preview(device = Devices.Smart.HERO_A1)
@Composable
fun MyPreview() {
    // Your composable content
}
```

## Device Specifications

### 480x960 (Medium)

**Screen specs**: 480x960px | **Aspect ratio**: 1:2

- **`SMART_PRIME_II`** - Smart Prime Ii | **DPI**: 240
  ```kotlin
  spec:width=480,height=960,unit=px,dpi=240
  ```

### 720x1440 (Large)

**Screen specs**: 720x1440px | **Aspect ratio**: 1:2

- **`HERO_A1`** - Hero A1 | **DPI**: 320
  ```kotlin
  spec:width=720,height=1440,unit=px,dpi=320
  ```

### 720x1600 (XL)

**Screen specs**: 720x1600px | **Aspect ratio**: 9:20

- **`SMART_HERO_II`** - Smart Hero Ii | **DPI**: 280
  ```kotlin
  spec:width=720,height=1600,unit=px,dpi=280
  ```

## Navigation

- [← Back to Main README](../../README.md)
- [📱 All Device Categories](../README.md)

---
*Generated automatically from Android Device Catalog*
